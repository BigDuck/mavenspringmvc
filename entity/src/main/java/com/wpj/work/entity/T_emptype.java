/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.entity;

/**
 *
 *
 */
public class T_emptype  extends BaseDaomain {
    private Integer tId;
    /**
     *
     *��������
     */
    private String tContent;
    /**
     *���ֽ���
     *
     */
    private String tIntroduce;
    /**
     *����ͼƬ��ַ
     *
     */
    private String tPhotoadd;
    /**
     *��������
     *
     */

    private String tOther;
    /**
     * �Ƿ�ɾ��
     */
    private int isDelete;
    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettContent() {
        return tContent;
    }

    public void settContent(String tContent) {
        this.tContent = tContent == null ? null : tContent.trim();
    }

    public String gettIntroduce() {
        return tIntroduce;
    }

    public void settIntroduce(String tIntroduce) {
        this.tIntroduce = tIntroduce == null ? null : tIntroduce.trim();
    }

    public String gettPhotoadd() {
        return tPhotoadd;
    }

    public void settPhotoadd(String tPhotoadd) {
        this.tPhotoadd = tPhotoadd == null ? null : tPhotoadd.trim();
    }

    public String gettOther() {
        return tOther;
    }

    public void settOther(String tOther) {
        this.tOther = tOther == null ? null : tOther.trim();
    }
}