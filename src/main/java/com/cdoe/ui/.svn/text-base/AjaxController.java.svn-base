package com.cdoe.ui;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdoe.util.UserInfo;

@Controller
@RequestMapping("/secure/Ajax")
public class AjaxController {

	private static final Logger logger = Logger.getLogger(AjaxController.class);

	@RequestMapping(value = "/lookup/{districtNum}", method = RequestMethod.GET)
	public @ResponseBody String getDistrictName(@PathVariable String districtNum, HttpSession session) {
		logger.debug("AjaxController.getDistrictName(" + districtNum + ")");
		UserInfo userInfo = (UserInfo) session.getAttribute(UserInfo.USER_INFO_ATTR);
		String districtName = userInfo.lookupDistrict(districtNum);
		logger.debug("AjaxController.getDistrictName(" + districtNum + ") returning: " + districtName);
		return districtName;
	}
}
