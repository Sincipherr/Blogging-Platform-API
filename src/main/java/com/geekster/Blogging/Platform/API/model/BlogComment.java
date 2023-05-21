package com.geekster.Blogging.Platform.API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BlogComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;
    private String commentBody;

    @ManyToOne
    @JoinColumn(name = "FK_PostID")
    private Post post;

    @ManyToOne
    @JoinColumn(nullable = false,name = "FK_User_ID")
    private User user;

}
