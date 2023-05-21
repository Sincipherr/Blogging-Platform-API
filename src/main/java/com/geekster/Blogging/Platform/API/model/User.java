package com.geekster.Blogging.Platform.API.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @NotEmpty
    @Column(nullable = false)
    private String userName;
    @Email
    @NotEmpty
    @Column(nullable = false,unique = true)
    private String userEmail;
    @NotEmpty
    @Column(nullable = false)
    private String userPassword;

}
