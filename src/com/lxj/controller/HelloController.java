package com.lxj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * HelloController
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

        ModelAndView mav = new ModelAndView("template/hello.jsp");
        mav.addObject("message", "hello this is a hello page");
        return mav;
    }

}