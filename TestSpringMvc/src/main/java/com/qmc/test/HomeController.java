package com.qmc.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/homec")
public class HomeController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/home",produces="application/json;charset=UTF-8")
	public @ResponseBody String home() {
		
		Date date = new Date();
		System.out.println("当前时间"+date);
		
		return "home";
	}
	
	
	@RequestMapping("/list")
	public @ResponseBody String getHome(){
		logger.info("getHome info start");
        logger.info("getHome info end");
		return "success";
	}
	
	@RequestMapping("/list111")
	public @ResponseBody String getHome111(){
		logger.info("getHome info start");
        logger.info("getHome info end1");
		return "success";
	}
	
	@RequestMapping("/list112")
	public @ResponseBody String getHome112(){
		logger.info("getHome info start");
        logger.info("getHome info end");
		return "success";
	}
}
