package com.puhj.ssmdemo.dao;

import com.puhj.ssmdemo.entity.Person;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * mybatis用注解方式开发
 */
@Repository("personDao")
public interface PersonDao {
    @Insert("insert into person values(#{username},#{email},#{gender},#{deptId})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    void insert(Person person);

    @Delete("delete from person where id = #{id}")
    void delete(Integer id);

    @Update("update person set username=#{username},#{email},#{gender},#{deptId} where id = #{id}")
    void update(Person person);

    @Select("select * from person where id = #{id}")
    Person select(Integer id);

    @Select("select * from person")
    List<Person> selectAll();
}
