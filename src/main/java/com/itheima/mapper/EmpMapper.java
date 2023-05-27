package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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


    @Select("select id, username, password, name, gender, image, job, enroll_date, dept_id,"
            + " create_time, update_time from emp where id = #{id}")
    Emp getById(Integer id);

    void updateEmp(Emp emp);
}
