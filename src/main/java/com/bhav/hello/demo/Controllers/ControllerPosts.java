package com.bhav.hello.demo.Controllers;
//import java.security.Provider.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhav.hello.demo.DTO.DTOpost;
import com.bhav.hello.demo.Services.ServicePosts;



/**
 * ControllerPosts
 */
@RestController
public class ControllerPosts {

    ServicePosts sp;
    ControllerPosts(ServicePosts sp){
        this.sp = sp;
    }

    @GetMapping("/posts/{id}")
    public DTOpost getPostById(@PathVariable int id){
        return sp.getPostById(id);
    }

    @GetMapping("/posts/")
    public DTOpost[] getAllPosts(){
        return sp.getAllPosts();
    }
}