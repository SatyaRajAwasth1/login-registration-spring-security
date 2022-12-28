package learn.spring.loginregisterspringsecurity.service;

import learn.spring.loginregisterspringsecurity.model.User;
import learn.spring.loginregisterspringsecurity.web.dto.UserRegistrationDto;

// interface to provide services for student
public interface UserService {
    User add(UserRegistrationDto userRegistrationDto);

}
