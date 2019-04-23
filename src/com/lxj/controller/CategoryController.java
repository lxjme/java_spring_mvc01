package com.lxj.controller;

import javax.servlet.http.HttpSession;

import com.lxj.pojo.Category;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * CategoryController
 */
@Controller
public class CategoryController {

    @RequestMapping("/addCategory")
    public ModelAndView add(Category category) {
        ModelAndView mav = new ModelAndView("show_category");
        return mav;
    } 

    @RequestMapping("/showCategory")
    public ModelAndView show() {
        ModelAndView mav = new ModelAndView("show_category");
        return mav;
    }

    @RequestMapping("/check")
    /**
     * @return
     */
    public ModelAndView check(HttpSession session) {
        Integer count =  (Integer) session.getAttribute("count");
        if(count == null) {
            count = 0;
        }
        count++;
        session.setAttribute("count", count);
         
        ModelAndView mav = new ModelAndView("check");
        return mav;
    }

    /**
     * 清空
     */
    @RequestMapping("/clear")
    public ModelAndView clear(HttpSession session) {
        session.removeAttribute("count");
        ModelAndView mav = new ModelAndView("redirect:/check");
        return mav;
    }
}