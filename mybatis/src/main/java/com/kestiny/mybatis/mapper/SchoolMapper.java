package com.kestiny.mybatis.mapper;

import com.kestiny.mybatis.entities.School;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface SchoolMapper {
    public List<School> selectAll();

    public School selectById(Integer id);

    public Boolean delete(Integer id);

    public Boolean save(School school);

    public Boolean update(School school);
}
