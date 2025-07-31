package com.training.S5_JWTSecurity.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    String userId;
    String name;
    String email;
}
