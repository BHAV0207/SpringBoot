package com.bhav.hello.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bhav.hello.demo.DTO.DTOcomment;
import com.bhav.hello.demo.Services.ServiceComments;

import jakarta.websocket.server.PathParam;

@RestController
public class ControllerComments {
    ServiceComments sc;
    ControllerComments(ServiceComments sc){
        this.sc = sc;
    }
    
    @GetMapping("/comments/{id}")
    public DTOcomment getCommentById(@PathVariable int id){
        return sc.getCommentById(id);
    }

    @GetMapping("/comments/")
    public DTOcomment[] getAllComments(){
        return sc.getAllComments();
    }

    @GetMapping("/posts/{postId}/comments")
    public DTOcomment[] getCommentFromPostId(@PathVariable int postId){
        return sc.getCommentFromPostId(postId);
    }

}
