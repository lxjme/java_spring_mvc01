package com.lxj.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.lxj.pojo.UploadImgFile;

import org.apache.commons.lang.xwork.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * UploadController
 */
@Controller
public class UploadController {

    @RequestMapping("uploadImage")
    public ModelAndView upload(HttpServletRequest request, UploadImgFile uploadFile)
            throws IllegalStateException, IOException {
        String name = RandomStringUtils.randomAlphanumeric(10);
        String newFileName = name + ".jpg";
        File newFile = new File(request.getServletContext().getRealPath("/image"), newFileName);
        newFile.getParentFile().mkdirs();
        uploadFile.getImage().transferTo(newFile);
        
        ModelAndView mav = new ModelAndView("show_upload_file");
        mav.addObject("imageName", newFileName);
        return mav;
    }
}