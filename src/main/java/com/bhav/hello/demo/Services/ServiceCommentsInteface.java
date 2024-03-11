package com.bhav.hello.demo.Services;

import com.bhav.hello.demo.DTO.DTOcomment;

/**
 * ServiceCommentsInteface
 */
public interface ServiceCommentsInteface {

    public DTOcomment getCommentById(int id);

    public DTOcomment[] getAllComments();
    
}