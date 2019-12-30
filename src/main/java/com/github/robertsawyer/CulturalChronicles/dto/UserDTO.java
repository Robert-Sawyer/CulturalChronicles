package com.github.robertsawyer.CulturalChronicles.dto;

import com.github.robertsawyer.CulturalChronicles.domain.model.UserDetails;

public class UserDTO {

    private String login;
    private UserDetails userDetails;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
