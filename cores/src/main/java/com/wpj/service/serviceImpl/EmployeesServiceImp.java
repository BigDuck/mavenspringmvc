/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpj.service.EmployeesService;
import com.wpj.work.dao.T_employeesMapper;
import com.wpj.work.entity.T_comment;
import com.wpj.work.entity.T_employees;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Server on 2015/5/30.
 * Ա��
 */
@Service
public class EmployeesServiceImp implements EmployeesService {
    @Resource
    private T_employeesMapper t_employeesMapper;
    @Resource
    private CommentServiceImp commentServiceImp;
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(EmployeesServiceImp.class);
    private static String TAG="EmployeesServiceImp";
    public int deleteByPrimaryKey(Integer eId) {
        return t_employeesMapper.deleteByPrimaryKey(eId);
    }

    /**
     * ����Ա��id��ȡԱ��������
     * @param id
     * @return ������Ϣ�ļ���
     */
    @Override
  public PageInfo<T_comment> selectCommentByEmployeeId(int id,int pageNum,int pageSize) {
        return commentServiceImp.selectByEmployeeId(id,pageNum,pageSize);
    }

    /**
     * ���Ա����Ϣ
     * @param record Ա����Ϣ
     * @return Ӱ������
     */
    public int insert(T_employees record) {
        return t_employeesMapper.insertSelective(record);
    }

    /**
     * ���ݷ�ҳ��ѯԱ����Ϣ
     * @param page_Num ҳ��
     * @param page_Size ÿҳ��С
     * @return Ա����Ϣ����
     */
    @Override
    public PageInfo<T_employees> selectEmployee(int page_Num, int page_Size) {
        PageHelper.startPage(page_Num, page_Size);
        List<T_employees> list=t_employeesMapper.selectAllByPage();
        PageInfo<T_employees> pageInfo=new PageInfo<T_employees>(list);
        log.debug(TAG+pageInfo);
        return pageInfo;

    }

    /**
     * ���Ա����Ϣ
     * @param record Ա����Ϣ
     * @return Ӱ������
     */
    public int insertSelective(T_employees record) {

        return t_employeesMapper.insertSelective(record);
    }

    /**
     * ����Ա��id��ȡԱ����Ϣ
     * @param eId
     * @return Ա����Ϣʵ����
     */
    public T_employees selectByPrimaryKey(Integer eId) {
        return t_employeesMapper.selectByPrimaryKey(eId);
    }

    /**
     * ����id����Ա����Ϣ
     * @param record Ա����Ϣ
     * @return Ӱ������
     */
    public int updateByPrimaryKeySelective(T_employees record) {
        return t_employeesMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * ����id����Ա����Ϣ
     * @param record Ա��ʵ����
      * @return Ӱ������
     */
    public int updateByPrimaryKey(T_employees record) {
        return t_employeesMapper.updateByPrimaryKey(record);
    }
}
