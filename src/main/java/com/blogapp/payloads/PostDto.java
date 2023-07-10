package com.blogapp.payloads;

import com.blogapp.entities.Category;
import com.blogapp.entities.User;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private int id;
    @NotNull(message = "Title cannot be null")
    @NotEmpty(message = "Title cannot be empty")
    private String title;
    @NotNull(message = "Content cannot be null")
    @NotEmpty(message = "Content cannot be empty")
    private String content;

    private String imageName;
    private Date date;
    private CategoryDto category;
    private UserDto user;
    private Set<CommentDto> comment = new HashSet<>();
}
