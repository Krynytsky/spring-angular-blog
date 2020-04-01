package demo.project.springangular.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class RegisterRequest  {
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
