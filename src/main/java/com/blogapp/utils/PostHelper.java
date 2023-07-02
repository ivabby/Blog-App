package com.blogapp.utils;

import com.blogapp.entities.Post;
import com.blogapp.payloads.PostDto;
import com.blogapp.payloads.PostResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostHelper {
    @Autowired
    public static ModelMapper modelMapper;

    public static PostResponse preparePostResponse(Page<Post> pagePost , List<Post> postList) {
        PostResponse postResponse = new PostResponse();
        postResponse.setContent(postList.stream().map(post -> modelMapper.map(post, PostDto.class)).collect(Collectors.toList()));
        postResponse.setPageNumber(pagePost.getNumber());
        postResponse.setPageSize(pagePost.getSize());
        postResponse.setTotalPages(pagePost.getTotalPages());
        postResponse.setTotalElements(pagePost.getTotalElements());
        postResponse.setLastPage(pagePost.isLast());

        return postResponse;
    }
}
