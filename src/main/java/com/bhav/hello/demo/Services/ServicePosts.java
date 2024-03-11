package com.bhav.hello.demo.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bhav.hello.demo.DTO.DTOpost;

/**
 * ServicePosts
 */
@Service
public class ServicePosts implements ServiceCommentsInteface{
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://jsonplaceholder.typicode.com";

    public DTOpost getPostById(int id){
        var response = restTemplate.getForObject(url + "/posts/" + id, DTOpost.class);
        
        return response;
    }

    public DTOpost[] getAllPosts(){
        var response = restTemplate.getForObject( url + "/posts/",DTOpost[].class);

        return response;
    }
    
}