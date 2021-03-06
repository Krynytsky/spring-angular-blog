package demo.project.springangular.service;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthenticationResponse {
    private String authenticationToken;
    private String email;
}
