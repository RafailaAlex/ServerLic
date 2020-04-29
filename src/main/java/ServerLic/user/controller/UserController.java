package ServerLic.user.controller;

import ServerLic.user.domain.User;
import ServerLic.user.repository.IUserRepository;
import ServerLic.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final IUserRepository userRepository;
    private final IUserService userService;

    @Autowired
    public UserController(IUserRepository userRepository, IUserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
       // return null;
        return userRepository.findAll();
    }

    @PostMapping("/saveuser")
    public User saveUser(User user) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(user);
        user.setId("a");
        user.setDisplayName("a");
        user.setEmail("a");
        user.setProfilePicture("a");
        System.out.println(user);
       return userService.saveUser(user);
        //return  null;
    }

}