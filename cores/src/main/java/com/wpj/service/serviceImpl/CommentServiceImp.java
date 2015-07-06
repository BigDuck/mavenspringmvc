/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpj.service.CommentService;
import com.wpj.work.dao.T_commentMapper;
import com.wpj.work.entity.Status;
import com.wpj.work.entity.T_comment;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 *����
 */
@Service
public class CommentServiceImp implements CommentService {
@Resource
private T_commentMapper t_commentMapper;
    private static Logger log = Logger.getLogger(CommentServiceImp.class);

    /**
     * ����idɾ������
     * @param cId  Ҫɾ����id
     * @return ����Ӱ��������1����һ����Ӱ�죬0������Ӱ�죩
     */
    public int deleteByPrimaryKey(Integer cId) {
        return t_commentMapper.deleteByPrimaryKey(cId);
    }
    /**
     * ���ݹ���id ɾ������
     * @param cId ����id
     * @return ����Ӱ��������1����һ����Ӱ�죬0������Ӱ�죩
     */
    @Override
    public int deleteByMasterKey(Integer cId) {
        return t_commentMapper.deleteByMasterKey(cId);
    }

    /**
     * ��������Ա��idɾ��
     * @param cId Ա��id
     * @return ����Ӱ��������1����һ����Ӱ�죬0������Ӱ�죩
     */
    @Override
    public int deleteByEmpKey(Integer cId) {
        return t_commentMapper.deleteByEmpKey(cId);
    }

    /**
     * ��������
     * @param record
     * @return
     */
    public int insert(T_comment record) {
        return t_commentMapper.insert(record);
    }

    /**
     * ��������
     * @param record
     * @return
     */
    public int insertSelective(T_comment record) {
        return t_commentMapper.insertSelective(record);
    }

    /**
     * ��ѯ��������id
     * @param cId
     * @return
     */
    public T_comment selectByPrimaryKey(Integer cId) {
        return t_commentMapper.selectByPrimaryKey(cId);
    }

    /**
     * ���ݹ�����id��ҳ��ȡ���۵ļ���
     * @param eId ����id
     * @param page_Num ҳ��
     * @param page_Size ÿһҳ�Ĵ�С
     * @return ���۵ļ��� ��ȡ���� pageInfo.getList().get(0)
     */
    @Override
    public PageInfo<T_comment> selectByMasterId(int eId, int page_Num, int page_Size) {
        PageHelper.startPage(page_Num, page_Size);
        List<T_comment> list=t_commentMapper.selectByMasterId(eId);
        PageInfo<T_comment> pageInfo=new PageInfo<T_comment>(list);
        log.debug("��ҳ�Ľ������"+pageInfo);
        return pageInfo;
    }

    /**
     * ����Ա��id��ҳ��ȡ����
     * @param empid Ա��id
     * @param page_Num ҳ��
     * @param page_Size  ÿһҳ�Ĵ�С
     * @return ��ҳ����
     */
    @Override
    public PageInfo<T_comment> selectByEmployeeId(int empid, int page_Num, int page_Size) {
        PageHelper.startPage(page_Num, page_Size);
        List<T_comment> list=t_commentMapper.selectByEmployeeId(empid);
        PageInfo<T_comment> pageInfo=new PageInfo<T_comment>(list);
        log.debug("��ҳ�Ľ������"+pageInfo);
        return pageInfo;
    }

    /**
     *ֱ�Ӹ��ݷ�ҳ��ȡ����,Ĭ�ϻ�ȡδɾ������
     * @param page_Num �ڼ�ҳ
     * @param page_Size ÿҳ�Ĵ�С
     * @return
     */
    @Override
    public PageInfo<T_comment> selectByPage(int page_Num, int page_Size) {
        PageHelper.startPage(page_Num, page_Size);
        List<T_comment> list=t_commentMapper.selectAll(1);
        System.out.println("--->"+list.size());
        PageInfo<T_comment> pageInfo=new PageInfo<T_comment>(list);
        return pageInfo;
    }
    /**
     * �Զ����ѯ�������Ƿ�ɾ����
     * @param page_Num ҳ��
     * @param page_Size ÿҳ��С
     * @param status ״̬
     * @return
     */
    public PageInfo<T_comment> selectByPage(int page_Num, int page_Size,Status status) {
        PageHelper.startPage(page_Num, page_Size);
        List<T_comment> list=t_commentMapper.selectAll(status.ordinal());
        System.out.println("--->"+list.size());
        PageInfo<T_comment> pageInfo=new PageInfo<T_comment>(list);
        return pageInfo;
    }


    /**
     *����
     * @param record ����
     * @return
     */
    public int updateByPrimaryKeySelective(T_comment record) {
        return 0;
    }

    public int updateByPrimaryKey(T_comment record) {
        return 0;
    }
}
