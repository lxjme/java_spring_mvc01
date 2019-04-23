package com.lxj.controller;

import com.lxj.pojo.Product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProductController
 */
@Controller
public class ProductController {

    @RequestMapping("/addProduct")
    public ModelAndView add(Product product) {
        ModelAndView mav = new ModelAndView("show_product");
        return mav;
    }
}