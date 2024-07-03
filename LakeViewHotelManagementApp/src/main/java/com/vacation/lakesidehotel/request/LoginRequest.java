package com.vacation.lakesidehotel.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author Gaurav Yadav
 */
@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
