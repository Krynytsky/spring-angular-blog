package demo.project.springangular.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
public class LoginRequest {
//    private String username;
    private String email;
    private String password;
}
