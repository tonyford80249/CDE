
/*
 * Copyright ResQSoft, Inc. 2011
 */
package com.cdoe.ui;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/secure/LandingMenu")
public class LandingMenuController {

	private static final Logger logger = Logger.getLogger(LandingMenuController.class);
	
	@RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
		return ".LandingMenu-index";
    }
	
}