package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

/*    @Select("Select count(*) from emp")
    Integer count();

    @Select("select * from emp limit #{startIndex}, #{pageSize}")
    List<Emp> selectEmp(Integer startIndex, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end);*/

    List<Emp> selectEmp(String name, Short gender, LocalDate begin, LocalDate end);

    void deleteEmps(List<Integer> ids);

    void addEmp(Emp emp);

}
