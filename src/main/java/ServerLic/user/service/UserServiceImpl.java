package ServerLic.user.service;

import ServerLic.user.domain.User;
import ServerLic.user.dto.UserDto;
import ServerLic.user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
    private final IUserRepository userRepository;
    @Autowired
    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User saveUser(UserDto user) {
        User currentUser = userRepository.findOneById(user.getId());
        if (currentUser == null) {
            currentUser = new User();
        }
        currentUser.setId(user.getId());
        currentUser.setDisplayName(user.getDisplayName());
        currentUser.setEmail(user.getEmail());
        currentUser.setProfilePicture(user.getProfilePicture());

        try{User savedUser = userRepository.save(currentUser);
        return savedUser;
        }
        catch (Exception ex) {

            return null;
        }

    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(String id) {
        return userRepository.findOneById(id);
    }
}
