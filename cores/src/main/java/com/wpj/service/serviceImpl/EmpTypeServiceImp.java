/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpj.service.EmpTypeService;
import com.wpj.work.dao.T_emptypeMapper;
import com.wpj.work.entity.T_emptype;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Server on 2015/5/30.
 */
@Service
public class EmpTypeServiceImp implements EmpTypeService {
    @Resource
    private T_emptypeMapper t_emptypeMapper;

    /**
     * ��ɾ��
     * @param tId Ҫɾ����id
     * @return
     */
    public int deleteByPrimaryKey(Integer tId) {
        return t_emptypeMapper.deleteByPrimaryKey(tId);
    }
    /**
     * ���
     * @param record ҵ��������
     * @return Ӱ������
     */
    public int insert(T_emptype record) {
        return t_emptypeMapper.insert(record);
    }
    /**&
     * ��ӣ��Ƽ�ʹ�ã�
     * @param record ҵ��������
     * @return Ӱ������
     */
    public int insertSelective(T_emptype record) {
        return t_emptypeMapper.insertSelective(record);
    }

    /**
     * ����id ��ȡҵ��������Ϣ
     * @param tId ҵ�����id
     * @return  ҵ��������
     */
    public T_emptype selectByPrimaryKey(Integer tId) {
        return selectByPrimaryKey(tId);
    }
    /**
     * ����ҵ�������Ϣ ���Ƽ�ʹ�ã�
     * @param record Ҫ���µĶ���
     * @return
     */
    public int updateByPrimaryKeySelective(T_emptype record) {
        return t_emptypeMapper.updateByPrimaryKeySelective(record);
    }
    /**
     * Ҫ���µĶ���
     * @param record
     * @return Ӱ������ һ��0
     */
    public int updateByPrimaryKey(T_emptype record) {
        return t_emptypeMapper.updateByPrimaryKey(record);
    }
    /**
     * ���ݷ�ҳ��ȡҵ����Ϣ
     * @param pageNum ҳ��
     * @param pageSize ÿҳ��С
     * @return ҵ���PageInfo���󼯺�
     */
    @Override
    public PageInfo<T_emptype> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<T_emptype> list=t_emptypeMapper.selectAll();
        PageInfo<T_emptype> pageInfo=new PageInfo<T_emptype>(list);
        return pageInfo;
    }
}
