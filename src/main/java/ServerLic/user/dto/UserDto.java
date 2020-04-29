package ServerLic.user.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String id;
    private String displayName;
    private String email;
    private String profilePicture;


}
