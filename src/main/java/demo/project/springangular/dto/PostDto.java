package demo.project.springangular.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostDto {
    private Long id;
    private String content;
    private String title;
    private String username;
}
