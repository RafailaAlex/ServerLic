package ServerLic.user.service;

import ServerLic.user.domain.User;

import ServerLic.user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{
    private final IUserRepository userRepository;
    @Autowired
    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
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

