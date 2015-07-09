/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :58:49
 * ---����:�����
 * ---QQ:757671834
 */

package com.wpj.common;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * ����spring security �ĸ���
 * @author�����
 * @version1.0.0
 *
 */
public class SecurityTools {
    /**
     * ��ȡ�û�����
     *
     * @return �û�������
     */
    public static String getUserName() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails.getUsername();
    }

    /**
     * ��ȡ�û�����
     * @return �û�����
     */
    public static String getUserPassword() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails.getPassword();
    }

    /**
     * ��ȡ�û�Ȩ��
     * @return Ȩ������
     */
    public static Object[] getUserAuthorities(){
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDetails.getAuthorities().toArray();
    }
}
