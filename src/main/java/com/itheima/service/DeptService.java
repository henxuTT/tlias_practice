package com.itheima.service;

import com.itheima.pojo.Dept;

import java.util.List;

public interface DeptService {

    List<Dept> list();

    void delete(Integer id);

    void addDept(Dept dept);

    Dept getById(Integer id);

    void updateDept(Dept dept);
}
