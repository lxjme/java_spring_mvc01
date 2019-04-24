package com.lxj.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.lxj.mapper.CategoryMapper;
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

        // 注解使用
        CategoryMapper mapper = session.getMapper(CategoryMapper.class);
        List<Category> cs =  mapper.listAll();
        for (Category c : cs) {
            System.out.println(c.getC_name());
        }
        // 列表
        // listAll(session);
        // 添加
        // addCategory(session);
        // listAll(session);
        // 修改
        // Category c = session.selectOne("getCategory", 2);
        // c.setC_name("分类名称002-修改");
        // session.update("updateCategory", c);
        // System.out.println(c.getC_name());
        // listAll(session);
        // 根据名称模糊查询
        // listCategoryByName(session);

        session.commit();
        session.close();

    }
    
    private static void listCategoryByName(SqlSession session) {
        System.out.println("========模糊查询=======");
        System.out.println("==================================");
        List<Category> cs = session.selectList("listCategoryByName", "01");
        for (Category c : cs) {
            System.out.println(c.getC_name());
        }
        System.out.println("==================================");
    }

    /**
     * 添加
     * @param session
     */
    private static void addCategory(SqlSession session) {
        Category c = new Category();
        c.setC_name("分类名称002");
        session.insert("addCategory", c);
    }

    /**
     * 列表
     * @param session
     */
    private static void listAll(SqlSession session) {
        List<Category> cs = session.selectList("listCategory");
        System.out.println(8888);
        System.out.println(cs.size());
        for (Category c : cs) {
            System.out.println(c.getC_name());
        }
    }

}