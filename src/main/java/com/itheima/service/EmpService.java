package com.itheima.service;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpResult;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {

    EmpResult selectEmp(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    void deleteEmps(List<Integer> ids);

    void addEmp(Emp emp);

    Emp getById(Integer id);

    void updateEmp(Emp emp);
}
