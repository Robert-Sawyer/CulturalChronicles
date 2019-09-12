package com.github.robertsawyer.CulturalChronicles.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {

    private String login;
    private String email;
    private String password;
    private String confirPassword;
}
