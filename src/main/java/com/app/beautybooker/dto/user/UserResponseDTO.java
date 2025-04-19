package com.app.beautybooker.dto.user;

import com.app.beautybooker.model.RoleEnum;
import lombok.Data;

@Data
public class UserResponseDTO {
    private int id;
    private String name;
    private String email;
    private String phone;
    private RoleEnum role;
}
