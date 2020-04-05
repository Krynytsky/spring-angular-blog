package demo.project.springangular.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString //(exclude = {"posts"})
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
//    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST)
//    private List <Post> posts = new ArrayList<>();

}
