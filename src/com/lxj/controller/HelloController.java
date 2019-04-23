package com.lxj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloController
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("message", "hello this is a hello page");
        return mav;
    }

}