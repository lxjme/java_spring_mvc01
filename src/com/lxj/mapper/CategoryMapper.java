package com.lxj.mapper;

import java.util.List;

import com.lxj.pojo.Category;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * CategoryMapper
 */
public interface CategoryMapper {

    @Insert("insert into t_category (c_name) values (#{c_name})")
    public int add(Category category);

    @Delete("delete from t_category where id=#{id}")
    public void delete(int id);

    @Select("select * from t_category")
    public List<Category> listAll();

    @Update("update t_category set c_name=#{c_name} where id=#{id}")
    public int updateCategory(Category category);
}