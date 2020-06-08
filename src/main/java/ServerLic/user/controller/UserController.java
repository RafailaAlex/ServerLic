package ServerLic.user.controller;

import ServerLic.user.domain.User;
import ServerLic.user.repository.IUserRepository;
import ServerLic.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final IUserService userService;
    @Autowired
    public UserController( IUserService userService) {
        this.userService = userService;
    }
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAll();
    }
    @PostMapping("/saveuser")
    public User saveUser(@RequestBody  User user) {
        return userService.saveUser(user);
    }
    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userService.getUser(id);
    }
}