package com.springboot.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data //genereaza Getter, Setter, toString, hashCode
@AllArgsConstructor
@NoArgsConstructor
//Clasa care se ocupa de Pagination support
public class PostResponse {
    private List<PostDto> content;
    private int pageNo;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean last;
}
