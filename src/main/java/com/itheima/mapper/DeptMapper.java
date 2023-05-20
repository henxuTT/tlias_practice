package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("select * from dept")
    List<Dept> list();

    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into dept(name, create_time, update_time) values(#{name}, #{createTime}, #{updateTime})")
    void addDept(Dept dept);

    @Select("select id, name, create_time, update_time from dept where id=#{id}")
    Dept getById(Integer id);

//    @Update("update dept set name=#{name}, update_time=#{createTime} where id=(select id from emp where name=#{})")
    @Update("update dept set name=#{name}, update_time=#{updateTime} where id=#{id}")
    void updateDept(Dept dept);
}
