package com.lxj.pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 * UploadImgFile
 */
public class UploadImgFile {

    MultipartFile image;

    /**
     * @return the image
     */
    public MultipartFile getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(MultipartFile image) {
        this.image = image;
    }

    
}