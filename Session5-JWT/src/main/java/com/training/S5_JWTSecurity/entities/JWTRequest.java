package com.training.S5_JWTSecurity.entities;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JWTRequest {

    private String username;
    private String password;
}
