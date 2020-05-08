package com.kestiny.mybatis.entieies;

import com.kestiny.mybatis.entities.Person;
import com.kestiny.mybatis.entities.School;
import com.kestiny.mybatis.mapper.PersonMapper;
import com.kestiny.mybatis.mapper.SchoolMapper;
import com.kestiny.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SchoolTest {
    private Logger logger = LoggerFactory.getLogger(SchoolTest.class);

    @Test
    public void schoolTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SchoolMapper mapper = sqlSession.getMapper(SchoolMapper.class);
        List<School> schools = mapper.selectAll();
        logger.debug("查找数据：" + schools.size());
        for (School school : schools) {
            System.out.println(school);
        }
    }

    @Test
    public void schoolPerson() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        List<Person> personList = mapper.selectAll();
        logger.info("查找数据：" + personList.size());
        for (Person person : personList) {
            logger.info(person.toString());
        }
    }
}
