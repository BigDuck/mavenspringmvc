/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.entity;

import java.util.Date;

/**
 *����
 *
 */
public class T_order  extends BaseDaomain {
    private String oId;
    /**
     *�µ�ʱ��
     *
     */
    private Date oStarttime;
    /**
     *
     *��������
     */
    private String oIntroduce;
    /**
     *
     *����
     */
    private String oOther;
    /**
     *����״̬��״̬��
     *
     */
    private Integer oStatus;
    /**
     *��������
     *
     */
    private String oEvaluation;
    /**
     *����ӵ����
     *
     */
    private Integer oOnwer;
    /**
     *������
     *
     */
    private String oNumber;
    /**
     * �����Ƿ�ɾ�� 1δɾ����0 ɾ��
     */
    private int isDelete;

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public Date getoStarttime() {
        return oStarttime;
    }

    public void setoStarttime(Date oStarttime) {
        this.oStarttime = oStarttime;
    }

    public String getoIntroduce() {
        return oIntroduce;
    }

    public void setoIntroduce(String oIntroduce) {
        this.oIntroduce = oIntroduce == null ? null : oIntroduce.trim();
    }

    public String getoOther() {
        return oOther;
    }

    public void setoOther(String oOther) {
        this.oOther = oOther == null ? null : oOther.trim();
    }

    public Integer getoStatus() {
        return oStatus;
    }

    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    public String getoEvaluation() {
        return oEvaluation;
    }

    public void setoEvaluation(String oEvaluation) {
        this.oEvaluation = oEvaluation == null ? null : oEvaluation.trim();
    }

    public Integer getoOnwer() {
        return oOnwer;
    }

    public void setoOnwer(Integer oOnwer) {
        this.oOnwer = oOnwer;
    }

    public String getoNumber() {
        return oNumber;
    }

    public void setoNumber(String oNumber) {
        this.oNumber = oNumber == null ? null : oNumber.trim();
    }
}