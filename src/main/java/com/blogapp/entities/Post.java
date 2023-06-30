package com.blogapp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String content;
    private String imageName;
    private Date createdDate;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;
}

// 1. Convert String to Date
// 2. Convert Date to String without 'T'