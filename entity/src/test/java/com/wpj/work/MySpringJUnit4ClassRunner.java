package com.wpj.work;/*
 * Copyright (c) 2015 �?2 �?23 �?
 * 	      2 �?14 �? 56�?
 *               作�?�：吴培�?
 *               Q  Q�?757671834
 * 	      It is not easy to meet each other in such a big world
 */

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import java.io.FileNotFoundException;

/**
 * Created by wpj on 2015/2/23.
 * ���ߣ������
 */
public class MySpringJUnit4ClassRunner extends SpringJUnit4ClassRunner {
    static {
        try {
            Log4jConfigurer.initLogging("classpath:log4j.properties");
            System.out.println("log4j ���سɹ��ˡ�����");
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot Initialize log4j");
        }
    }

    public MySpringJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }
}
