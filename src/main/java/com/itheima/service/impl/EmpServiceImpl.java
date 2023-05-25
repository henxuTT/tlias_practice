package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpResult;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

/*    @Override
    public EmpResult selectEmp(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {

        Integer total = empMapper.count();

        Integer startIndex = (page-1)*pageSize;
        List<Emp> empList = empMapper.selectEmp(startIndex, pageSize, name, gender, begin, end);
        return new EmpResult(total, empList);
    }*/

    @Override
    public EmpResult selectEmp(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {

        PageHelper.startPage(page, pageSize);
        List<Emp> empList = empMapper.selectEmp(name, gender, begin, end);
        Page<Emp> p = (Page<Emp>) empList;

        EmpResult empResult = new EmpResult((int) p.getTotal(), p.getResult());
        return empResult;
    }

    @Override
    public void deleteEmps(List<Integer> ids) {
        empMapper.deleteEmps(ids);
    }

    @Override
    public void addEmp(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.addEmp(emp);
    }
}
