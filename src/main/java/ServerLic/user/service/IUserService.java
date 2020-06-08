package ServerLic.user.service;

import ServerLic.user.domain.User;


public interface IUserService {


    User saveUser(User user);

    User getUser(String id);

}
