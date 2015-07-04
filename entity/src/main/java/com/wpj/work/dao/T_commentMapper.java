/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.dao;

import com.wpj.work.entity.T_comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface T_commentMapper {
    /**
     * xml ����Ҫ��ResultMap
     * ��ȡ���е�����
     * @return
     */
    List<T_comment> selectAll(@Param("isdelete") Integer isdelete);

    /**
     * ��������idɾ������
     * @param cId
     * @return
     */
    int deleteByPrimaryKey(Integer cId);

    /**
     * ���ݹ���idɾ������
     * @param cId
     * @return
     */
    int deleteByMasterKey(Integer cId);

    /**
     * ����Ա��id ɾ������
     * @param cId
     * @return
     */
    int  deleteByEmpKey(Integer cId);
    /**
     * ����Ա����id��ȡ����
     * @param eId ����id
     * @return Ա������
     */

    List<T_comment> selectByMasterId(int eId);

    /**
     * ����ԱԱ��id��ȡ����
     * @param empid Ա��id
     * @return Ա������
     */
    List<T_comment> selectByEmployeeId(int empid);

    /**
     * �������
     * @param record ����ʵ����
     * @return Ӱ������
     */
    int insert(T_comment record);

    /**
     * ����һ������,ֻ���벻Ϊnull���ֶ�,����Ӱ����Ĭ��ֵ���ֶ�
     *֧��Oracle����,UUID,����Mysql��INDENTITY�Զ�����(�Զ���д)
     *����ʹ�ô���Ĳ���ֵ,����ֵ��ʱ,�Ż�ʹ�����С�UUID,�Զ�����
     * @param record
     * @return
     */
    int insertSelective(T_comment record);

    /**
     * ��������id��ȡ����
     * @param cId
     * @return
     */
    T_comment selectByPrimaryKey(Integer cId);

    /**
     * ����
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T_comment record);

    int updateByPrimaryKey(T_comment record);
}