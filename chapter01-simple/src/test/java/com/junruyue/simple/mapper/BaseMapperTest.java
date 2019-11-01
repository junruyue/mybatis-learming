package com.junruyue.simple.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.Reader;

public class BaseMapperTest {

    private static SqlSessionFactory sessionFactory;

    /**
     * 初始化sessionFactory
     */
    @BeforeClass
    public static void init() {
        try {
            //不能加classpath
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SqlSession getSqlSession() {

        return sessionFactory.openSession();
    }


}
