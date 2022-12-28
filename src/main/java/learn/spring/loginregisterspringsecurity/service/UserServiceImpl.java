package learn.spring.loginregisterspringsecurity.service;

import learn.spring.loginregisterspringsecurity.model.Role;
import learn.spring.loginregisterspringsecurity.model.User;
import learn.spring.loginregisterspringsecurity.repository.UserRepository;
import learn.spring.loginregisterspringsecurity.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//implementation for the UserService
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User add(UserRegistrationDto userRegistrationDto) {
        User user = new User(userRegistrationDto.getFirstName(),userRegistrationDto.getLastName(),
                userRegistrationDto.getEmail(), userRegistrationDto.getPassword(), Arrays.asList(new Role("USER_ROLE")));
        return userRepository.save(user);
    }
}
