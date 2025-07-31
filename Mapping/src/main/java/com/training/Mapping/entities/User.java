package com.training.Mapping.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @Id
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    List<Post> postList;
}
