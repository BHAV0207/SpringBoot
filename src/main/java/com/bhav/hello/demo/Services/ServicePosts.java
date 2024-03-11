package com.bhav.hello.demo.Services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bhav.hello.demo.DTO.DTOpost;

/**
 * ServicePosts
 */
@Service
public class ServicePosts implements ServicePostsInteface{
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
    

    public DTOpost getNewPost(DTOpost newPost){
        var response = restTemplate.postForObject(url + "/posts/", newPost , DTOpost.class);
        return response;
    }

    public DTOpost updatePost(DTOpost upadatePost , int id){
        var response = restTemplate.exchange(url + "/posts/" + id , HttpMethod.PUT ,new HttpEntity<DTOpost>(upadatePost), DTOpost.class);
        return response.getBody();
    }

    public DTOpost delPost(int id){
        var response = restTemplate.exchange(url + "/posts/" + id ,HttpMethod.DELETE ,  null ,DTOpost.class);

        return response.getBody();
    }
}