package com.cdoe.ui;

import com.cdoe.biz.model.StateEqual;
import com.cdoe.services.IDisplayAdjustmentManager;
import com.cdoe.ui.form.BaseForm;
import com.cdoe.ui.form.TransportationForm;
import com.cdoe.ui.view.AltAtRiskCalcView;
import com.cdoe.util.UserInfo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

/**
 *
 * @author Tony Ford
 */
@Controller
@RequestMapping("/secure/AltAtRiskFunding")
public class ExcelDownLoadController {

    private static final Logger LOGGER = Logger.getLogger(ExcelDownLoadController.class);
    
    @Autowired
    private MappingJacksonJsonView standardJsonView;        
    
    @Autowired
    private AltAtRiskCalcView altAtRiskFundCalcView;

    @Autowired
    private IDisplayAdjustmentManager displayAdjustmentManager;

    public ExcelDownLoadController() {
    }
    
     @RequestMapping(method = RequestMethod.GET)
    public String index(Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String districtNos = (String) session.getAttribute("districtNos");
        String districtName = (String) session.getAttribute("districtName");
        String fiscalYear = (String) session.getAttribute("fiscalYear");
        UserInfo userInfo = (UserInfo) session.getAttribute("USER_INFO");
        userInfo.getDistrictMap();
        
          Object[] districtCodes = userInfo.getAllDistrictCodes().toArray();

        BaseForm form = new BaseForm(districtNos, districtName, fiscalYear);
        
         model.addAttribute("stateEqualPaymentForm", form);
         model.addAttribute("districtNumbers", districtCodes);
        return ".AltAtRiskFundCalc-index";
    }
    

     @RequestMapping(value = "/json", method = RequestMethod.GET)
    public ModelAndView retrieve(@RequestParam String districtNumber, @RequestParam String fiscalYear, HttpServletRequest request) {
        try {
            Map<String, Object> parameterMap = new HashMap<String, Object>();

            HttpSession session = request.getSession();

            UserInfo userInfo = (UserInfo) session.getAttribute("USER_INFO");

            String districtName = userInfo.getDistrictMap().get(districtNumber);

                        
            BaseForm form = new BaseForm(districtNumber, districtName, fiscalYear);

            parameterMap.put("stateEqualPaymentForm", form);

            return new ModelAndView(standardJsonView, parameterMap);
        } catch (Throwable t) {
            LOGGER.error("Exception occurred during retrieve.", t);
        } finally {
            LOGGER.info("generating json response ");
        }

        return null;
    }
     
    @RequestMapping(value = "/report/altatriskcalc.xls", method = RequestMethod.POST)
    public ModelAndView download1(@RequestParam String districtNumber, @RequestParam String fiscalYear, HttpServletRequest request) {
        final String reportName = "atRiskFunding";
        final String format = "Xls";
        
        HttpSession session = request.getSession();        
        UserInfo userInfo = (UserInfo) session.getAttribute("USER_INFO");
        userInfo.getDistrictMap();

        Map<String, String> districtsMap = userInfo.getDistrictMap();;
        
        String districtName = userInfo.getDistrictMap().get(districtNumber);

        Set<String> keys = districtsMap.keySet();
        Object[] districtCodes = (Object[]) keys.toArray();

        try {
            Map<String, Object> parameterMap = new HashMap<String, Object>(); 
            
            List<StateEqual> results = displayAdjustmentManager.getStateEqualInfo(districtNumber, fiscalYear);
            
            if (results.isEmpty()) {
                parameterMap.put("districtNumbers", districtCodes);
                parameterMap.put("stateEqualPaymentForm",  new BaseForm(districtNumber, districtName, fiscalYear));
                parameterMap.put("errorMessage", "Missing payment record");
                
             return new ModelAndView(".AltAtRiskFundCalc-index", parameterMap);   
            } 
            
            StateEqual se = results.iterator().next();
            
            parameterMap.put("stateEqualData", se);
            parameterMap.put("districtName", districtName);
            
            //String reportId = reportName + "Report" + format + "View";
            return new ModelAndView(altAtRiskFundCalcView, parameterMap);
        } catch (Throwable t) {
            LOGGER.error("Exception occurred during retrieve.", t);
        } finally {
            LOGGER.info("generating json response ");
        }

        return null;
    }
}
