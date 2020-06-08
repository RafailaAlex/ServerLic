package ServerLic.user.service;

import ServerLic.user.domain.User;

import java.util.List;


public interface IUserService {
    User saveUser(User user);
    User getUser(String id);
    List<User> getAll();
}
