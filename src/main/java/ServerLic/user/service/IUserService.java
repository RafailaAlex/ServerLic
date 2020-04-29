package ServerLic.user.service;

import ServerLic.user.domain.User;
import ServerLic.user.dto.UserDto;

public interface IUserService {
    User saveUser(UserDto user);

    User saveUser(User user);

    User getUser(String id);

}
