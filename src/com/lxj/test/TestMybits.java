package com.lxj.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.lxj.pojo.Category;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * TestMybits
 */
public class TestMybits {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();

        List<Category> cs = session.selectList("listCategory");
        System.out.println(8888);
        System.out.println(cs.size());
        for (Category c : cs) {
            System.out.println(c.getC_name());
        }
    }
}