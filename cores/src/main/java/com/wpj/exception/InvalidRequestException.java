/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :50:9
 * ---����:�����
 * ---QQ:757671834
 */

package com.wpj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class InvalidRequestException extends AccessDeniedException {
    public InvalidRequestException(String message) {
        super(message);
        System.out.println("-----------ΰ��� 403---------------------");
    }
}
