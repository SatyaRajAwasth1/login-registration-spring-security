package learn.spring.loginregisterspringsecurity.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configurable
@EnableWebSecurity
public class UserSecurityConfig  {
}
