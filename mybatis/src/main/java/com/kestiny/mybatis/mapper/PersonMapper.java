package com.kestiny.mybatis.mapper;

import com.kestiny.mybatis.entities.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PersonMapper {
    public List<Person> selectAll();

    public Person selectById(@Param("id") Integer id);

    public Person selectByName(@Param("name") String name);

    public Boolean delete(@Param("id") Integer id);

    public Boolean save(Person person);

    public Boolean update(Map<String, String> values);
}
