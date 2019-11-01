package com.junruyue.simple.mapper;

import com.junruyue.simple.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class CountryMapperTest extends BaseMapperTest {


    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSqlSession();
        try {
            List<Country> list = sqlSession.selectList("com.junruyue.simple.mapper.CountryMapper.selectAll");
            printCountryList(list);
        }finally {
            sqlSession.close();
        }
    }

    private void printCountryList(List<Country> list) {
        for (Country country : list) {
            System.out.printf("%-4d%4s%4s\n", country.getId(), country.getCountryname(), country.getCountrycode());
        }
    }
}
