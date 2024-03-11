package com.bhav.hello.demo.DTO;

import lombok.Getter;
import lombok.Setter;

/**
 * DTOpost
 */
@Getter
@Setter
public class DTOpost {
     private int postId;
     private int id ;
     private String name;
     private String email;
     private String body;
}