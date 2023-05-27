package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpResult;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping
    public Result selectEmp(@RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer pageSize,
                            String name, Short gender,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
        log.info("Select employees that match the given conditions");
        EmpResult empResult = empService.selectEmp(page,pageSize,name,gender,begin,end);

        return Result.success(empResult);
    }

    @DeleteMapping("/{ids}")
    public Result deleteEmps(@PathVariable List<Integer> ids){
        log.info("Delete employees by ids");
        empService.deleteEmps(ids);
        return Result.success();
    }

    @PostMapping
    public Result addEmp(@RequestBody Emp emp){
        log.info("Add a new employee");
        empService.addEmp(emp);

        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("Get employee by id");
        Emp emp = empService.getById(id);
        return Result.success(emp);
    }

    @PutMapping
    public Result updateEmp(@RequestBody Emp emp){
        log.info("Update employee information by id");
        empService.updateEmp(emp);

        return Result.success();
    }



}
