package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {

//    private static Logger log = LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptService deptService;

//    @RequestMapping(value = "/depts", method = RequestMethod.GET)
    @GetMapping
    public Result list(){
        log.info("Query for all department information");

        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("Delete the selected department by id: {}", id);

        deptService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result addDept(@RequestBody Dept dept){
        log.info("Add a new department: {}", dept);
        deptService.addDept(dept);

        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("Get the department name by id: {}", id);

        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    @PutMapping
    public Result updateDept(@RequestBody Dept dept){
        log.info("update department name: {}", dept);
        deptService.updateDept(dept);

        return Result.success();
    }


}
