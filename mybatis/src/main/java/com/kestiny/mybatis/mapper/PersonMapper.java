package com.kestiny.mybatis.mapper;

import com.kestiny.mybatis.entities.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PersonMapper {
    public List<Person> selectAll();

    public Person selectById(Integer id);

    public Person selectByName(String name);

    public Boolean delete(Integer id);

    public Boolean save(Person person);

    public Boolean update(Person person);
}
