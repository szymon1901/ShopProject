package com.example.shop.services;

import com.example.shop.exceptions.DuplicateEmailException;
import com.example.shop.models.User;
import com.example.shop.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createNewUser(User user){
        Optional<User> byEmail = userRepository.findByEmail(user.getEmail());
        byEmail.ifPresent(e -> {
            throw new DuplicateEmailException("Użytkownik o podanym adresie email już istnieje");
        });
        User saveUser = userRepository.save(user);
        return saveUser;
    }
}
