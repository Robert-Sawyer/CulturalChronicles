package com.github.robertsawyer.CulturalChronicles.services;

import com.github.robertsawyer.CulturalChronicles.domain.model.User;
import com.github.robertsawyer.CulturalChronicles.domain.model.UserDetails;
import com.github.robertsawyer.CulturalChronicles.domain.repositories.UserRepository;
import com.github.robertsawyer.CulturalChronicles.dto.RegisterDTO;
import com.github.robertsawyer.CulturalChronicles.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.userRepository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public void registerUser(RegisterDTO form) {
        User user = Converters.convertToUser(form);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        UserDetails details = new UserDetails();
        details.setId(user.getId());
        user.setUserDetails(details);
        userRepository.save(user);
    }

    public void editUserData(){

    }

    public UserDTO findUser(String login) {
        return null;
    }
}
