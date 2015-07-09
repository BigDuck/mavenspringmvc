/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :50:23
 * ---����:�����
 * ---QQ:757671834
 */

package com.wpj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {

        super(message);
        System.out.println("-------------ҳ���Ҳ���Ŷ---------------");
    }
}
