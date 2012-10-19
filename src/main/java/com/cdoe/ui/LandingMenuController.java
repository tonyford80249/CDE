
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cdoe.util.UserInfo;
@Controller
@RequestMapping("/secure/LandingMenu")
public class LandingMenuController {

	private static final Logger logger = Logger.getLogger(LandingMenuController.class);
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model, HttpSession session) {
		UserInfo userInfo = (UserInfo) session.getAttribute(UserInfo.USER_INFO_ATTR);
		if (userInfo.isTransportationUser())
			return ".TransportationHomePage-index";
		else if (userInfo.isStateEqualUser())
			return ".StateEqualHomePage-index";
		else
			return ".LandingMenu-index";
    }
	
}