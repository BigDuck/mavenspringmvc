package com.wpj.work;/*
 * Copyright (c) 2015 /3 /29
 * 	      6 :22 : 11
 *               By: wupeiji
 *               Q  Q:757671834
 * 	      It is not easy to meet each other in such a big world
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by wpj on 2015/2/23.
 * ���ߣ������
 * @see ��������ĸ��࣬ÿ�����Զ�����̳����������޷���ȡ���ݡ�
 */
@RunWith(MySpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring-mybatis.xml","classpath:config/spring-service.xml"})
public class TestFather extends AbstractTransactionalJUnit4SpringContextTests {
//    ��������Դ
    @Resource(name="dataSource")
    @Override
    public void setDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
    }
    @Test
    public void TestFather(){
        System.out.println("----------------------------------------------------------------");
    }
}
