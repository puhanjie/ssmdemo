package com.puhj.ssmdemo.service;

import com.puhj.ssmdemo.entity.Dept;

import java.util.List;

public interface DeptService {
    void add(Dept dept);
    void remove(Integer id);
    void edit(Dept dept);
    Dept get(Integer id);
    List<Dept> getAll();
}
