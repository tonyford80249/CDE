/**
 * 
 */
package com.cdoe.util;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import us.co.cde.state.security.exception.CdeApplicationSecurityException;

import com.cdoe.services.IReferenceDataManager;
import java.util.Map.Entry;

/**
 * This intercepter will populate the UserInfo class in the session
 * so that controllers can have access to the authorization information.
 * 
 * It also checks the rule that a user cannot have both Audit and State
 * Equal or Audit and Transportation privileges
 * 
 * It also checks to make sure the user has privileges to the page they are
 * trying to access 
 * 
 * @author dyn-8
 *
 */
public class UserInfoInterceptor extends HandlerInterceptorAdapter {
	
	private IReferenceDataManager referenceDataManager;

	/**
	 * Sets the referenceDataManager
	 * @param referenceDataManager
	 */
	public void setReferenceDataManager(IReferenceDataManager referenceDataManager) {
		this.referenceDataManager = referenceDataManager;
	}

	/**
	 * This is the method that will check the request to see if if is
	 * new and if so, will put the UserInfo data into the session.
	 * 
	 * It also checks to make sure the user is authorized for the page
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		boolean retValue = true;
		HttpSession session = request.getSession(false);
		if (session != null && session.isNew() && session.getAttribute("USER_INFO") == null) {
			Map<String, String> districtMap = referenceDataManager.getDistrictReference();
			UserInfo userInfo = new UserInfo(request, districtMap);
			if (userInfo.isValid()) {
				request.getSession().setAttribute("USER_INFO", userInfo);
                                
                                Entry<String, String> currentDistrict = userInfo.getDistrictMap().entrySet().iterator().next();
                                
                                request.getSession().setAttribute("districtNos", currentDistrict.getKey());
		                request.getSession().setAttribute("districtName", currentDistrict.getValue());
		                request.getSession().setAttribute("fiscalYear", DateUtil.getFiscalYear());
                                
				retValue = true;
			} else {
				request.getSession().invalidate();
				throw new CdeApplicationSecurityException("User not authorized");
			}
		} else if (session.getAttribute("USER_INFO") == null) {
			request.getSession().invalidate();
			response.sendRedirect("/equal/index.jsp");
		}
		return retValue;
	}

}
