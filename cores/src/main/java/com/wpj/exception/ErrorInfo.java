/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :48:19
 * ---����:�����
 * ---QQ:757671834
 */

package com.wpj.exception;

/**
 * Created by wpj on 2015/5/14.
 * ���ߣ������
 */
public class ErrorInfo {
    public  String url;
    public  String ex;
    public ErrorInfo(String url, Exception ex){
        this.url=url;
        this.ex=ex.getLocalizedMessage();
    }

}