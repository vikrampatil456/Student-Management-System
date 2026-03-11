package com.student.management.Config;

import com.student.management.Model.Users;
import com.student.management.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner loadSampleData(UserRepository userRepository, PasswordEncoder passwordEncoder) {

        return args -> {
            if (!userRepository.existsByUserName("Admin")) {
                Users users = new Users();
                users.setUserName("Admin");
                users.setPassword(passwordEncoder.encode("Admin@123"));
                users.setActive(true);
                userRepository.save(users);
            }
        };
    }
}
