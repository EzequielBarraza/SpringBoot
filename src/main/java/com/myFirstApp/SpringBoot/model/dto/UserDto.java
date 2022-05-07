
package com.myFirstApp.SpringBoot.model.dto;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class UserDto {
    private String email;
    private String password;
    
    public UserDto() {}

    public UserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" + "email=" + email + ", password=" + password + '}';
    }
    
    
}
