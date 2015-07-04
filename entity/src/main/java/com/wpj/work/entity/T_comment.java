/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.entity;

import java.util.Date;

/**
 * ����
 */
public class T_comment extends BaseDaomain  {
    /**
     * ����id
     */
    private Integer cId;
    /**
     * ��������
     */
    private String cContent;
    /**
     * ��Աid����˭�����ۣ�
     */
    private Integer eId;
    /**
     * ����ʱ��
     */
    private Date cDatatime;
    /**
     * ˭�����������۵ġ�
     */
    private Integer empId;

    /**
     * �Ƿ�ɾ�� 1 δɾ�� 0ɾ��
     *
     * @return
     */
    private Integer isdelete;
    /**
     * ��������Ա��
     */
    private T_employees t_employees;
    /**
     * ���۵��ˣ���������
     */
    private T_masters t_masters;

    public T_employees getT_employees() {
        return t_employees;
    }

    public void setT_employees(T_employees t_employees) {
        this.t_employees = t_employees;
    }

    public T_masters getT_masters() {
        return t_masters;
    }

    public void setT_masters(T_masters t_masters) {
        this.t_masters = t_masters;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Date getcDatatime() {
        return cDatatime;
    }

    public void setcDatatime(Date cDatatime) {
        this.cDatatime = cDatatime;
    }

    public Integer getEmpId() {
        return empId;
    }

    public T_comment(String cContent, Integer eId, Date cDatatime, Integer empId) {
        this.cContent = cContent;
        this.eId = eId;
        this.cDatatime = cDatatime;
        this.empId = empId;
    }

    public T_comment() {
    }

    @Override
    public String toString() {
        return "T_comment{" +
                "cId=" + cId +
                ", cContent='" + cContent + '\'' +
                ", eId=" + eId +
                ", cDatatime=" + cDatatime +
                ", empId=" + empId +
                ", isdelete=" + isdelete +
                ", t_employees=" + t_employees +
                ", t_masters=" + t_masters +
                '}';
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}