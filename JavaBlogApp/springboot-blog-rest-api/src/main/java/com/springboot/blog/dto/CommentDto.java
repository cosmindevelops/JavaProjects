package com.springboot.blog.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class CommentDto {
    private long id;
    private String name;
    private String email;
    private String body;
}