package learn.spring.loginregisterspringsecurity.web.controller;

import learn.spring.loginregisterspringsecurity.model.User;
import learn.spring.loginregisterspringsecurity.service.UserService;
import learn.spring.loginregisterspringsecurity.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// a controller class for user registration
@Controller
@RequestMapping("/register")
public class UserRegistrationController {
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping

    public String registerUser(UserRegistrationDto registrationDto){
        userService.add(registrationDto);
        return "redirect:/register?sucess"; // redirect to the page after registering
    }
}
