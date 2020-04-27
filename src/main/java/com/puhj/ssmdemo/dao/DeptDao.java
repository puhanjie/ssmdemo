package com.puhj.ssmdemo.dao;

import com.puhj.ssmdemo.entity.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * mybatis用mapper.xml文件方式开发
 */
@Repository("deptDao")
public interface DeptDao {
    void insert(Dept dept);
    void delete(Integer id);
    void update(Dept dept);
    Dept select(Integer id);
    List<Dept> selectAll();
}
