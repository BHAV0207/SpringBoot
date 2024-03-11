package com.bhav.hello.demo.Services;

import com.bhav.hello.demo.DTO.DTOpost;

public interface ServicePostsInteface {
    public DTOpost getPostById(int id);

    public DTOpost[] getAllPosts();

    public DTOpost getNewPost(DTOpost newPost);

    public DTOpost updatePost(DTOpost updatePost , int id);

    public DTOpost delPost(int id);
}
