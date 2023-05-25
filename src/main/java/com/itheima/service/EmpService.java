package com.itheima.service;

import com.itheima.pojo.EmpResult;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {

    EmpResult selectEmp(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);

    void deleteEmp(List<Integer> ids);
}
