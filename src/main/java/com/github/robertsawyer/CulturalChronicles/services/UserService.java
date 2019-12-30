package com.github.robertsawyer.CulturalChronicles.services;

import com.github.robertsawyer.CulturalChronicles.domain.model.User;
import com.github.robertsawyer.CulturalChronicles.domain.model.UserDetails;
import com.github.robertsawyer.CulturalChronicles.domain.repositories.UserRepository;
import com.github.robertsawyer.CulturalChronicles.dto.EditUserDataDTO;
import com.github.robertsawyer.CulturalChronicles.dto.RegisterDTO;
import com.github.robertsawyer.CulturalChronicles.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.userRepository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public User getLoggedUser() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return userRepository.findFirstByUsername(username).orElse(null);
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

    @Transactional
    public void editUserData(EditUserDataDTO edit){
        User user = getLoggedUser();
        UserDetails details = new UserDetails(
                edit.getFirstName(),
                edit.getLastName(),
                edit.getGender(),
                edit.getBirthDate(),
                edit.getCity());
        user.setUserDetails(details);
        userRepository.save(user);
    }

    public UserDTO findUser(String login) {
        if (login == null) {
            throw new IllegalArgumentException("Musisz podać nazwę użytkownika");
        }

        Optional<User> optionalUser = userRepository.findByLogin(login);
        User user = optionalUser.orElse(null);

        if (user == null) {
            throw new IllegalArgumentException("Znaleziono użytkownika dla nazwy: " + login);
        }

        return Converters.convertToUserDTO(user);
    }

}
