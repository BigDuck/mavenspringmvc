/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.entity;
/**
 *����״̬
 *
 */
public class T_orderStatus  extends BaseDaomain {
    /**
     *״̬id
     *
     */
    private Integer sId;
    /**
     *״̬��
     *
     */
    private String sContent;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsContent() {
        return sContent;
    }

    public void setsContent(String sContent) {
        this.sContent = sContent == null ? null : sContent.trim();
    }
}