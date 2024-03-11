package com.bhav.hello.demo.Services;

import com.bhav.hello.demo.DTO.DTOpost;

public interface ServicePostsInteface {
    public DTOpost getPostById();

    public DTOpost[] getAllPosts();

    
}
