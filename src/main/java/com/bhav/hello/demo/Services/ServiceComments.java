package com.bhav.hello.demo.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bhav.hello.demo.DTO.DTOcomment;

@Service
public class ServiceComments implements ServiceCommentsInteface{
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://jsonplaceholder.typicode.com";

    public DTOcomment getCommentById(int id){
        var response = restTemplate.getForObject(url + "/comments/" + id, DTOcomment.class);
        return response;
    }

    public DTOcomment[] getAllComments(){
        var response = restTemplate.getForObject(url + "/comments/", DTOcomment[].class);
        return response;
    }
    
}
