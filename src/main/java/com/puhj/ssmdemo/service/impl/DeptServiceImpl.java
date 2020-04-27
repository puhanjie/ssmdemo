package com.puhj.ssmdemo.service.impl;

import com.puhj.ssmdemo.dao.DeptDao;
import com.puhj.ssmdemo.entity.Dept;
import com.puhj.ssmdemo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptServiceImpl")
public class DeptServiceImpl implements DeptService {

    @Qualifier("deptDao")
    @Autowired
    private DeptDao deptDao;

    @Override
    public void add(Dept dept) {
        deptDao.insert(dept);
    }

    @Override
    public void remove(Integer id) {
        deptDao.delete(id);
    }

    @Override
    public void edit(Dept dept) {
        deptDao.update(dept);
    }

    @Override
    public Dept get(Integer id) {
        return deptDao.select(id);
    }

    @Override
    public List<Dept> getAll() {
        return deptDao.selectAll();
    }
}
