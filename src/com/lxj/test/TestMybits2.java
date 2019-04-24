package com.lxj.test;

import java.util.List;

import com.lxj.mapper.CategoryMapper;
import com.lxj.pojo.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * TestMybits2
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMybits2 {

    @Autowired
    private static CategoryMapper categoryMapper;
    public static void main(String[] args) {
        Category c = new Category();
        c.setC_name("分类名称-新的");
        categoryMapper.add(c);

        List<Category> cs = categoryMapper.listAll();
        
        for (Category c1 : cs) {
            System.out.println(c1.getC_name());
        }
    }


  
    
}