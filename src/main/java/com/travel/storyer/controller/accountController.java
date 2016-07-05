package com.travel.storyer.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.travel.storyer.service.accountService;

@Controller
public class accountController {

	@Resource
	accountService sAccount;

	@RequestMapping(value = "login", method = { RequestMethod.GET }, consumes = { "application/json" })
	public ModelAndView helloPage() {
		return new ModelAndView("test", "mes", sAccount.findOneByIntId(1));
	}
}
