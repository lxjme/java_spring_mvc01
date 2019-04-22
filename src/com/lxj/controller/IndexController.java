package com.lxj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * IndexController
 */
public class IndexController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

        ModelAndView mav = new ModelAndView("template/index.jsp");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }

    
}