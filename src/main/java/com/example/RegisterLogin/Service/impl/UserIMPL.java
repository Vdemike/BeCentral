package com.example.RegisterLogin.Service.impl;

import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Dto.UserDTO;
import com.example.RegisterLogin.Entity.User;
import com.example.RegisterLogin.Repo.UserRepo;
import com.example.RegisterLogin.Service.UserService;
import com.example.RegisterLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDTO userDTO) {
        User user = new User(
                userDTO.getUserid(),
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getCompany(),
                userDTO.getEmail(),
                this.passwordEncoder.encode(userDTO.getPassword())
        );

        userRepo.save(user);
        return user.getFirstName();
    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {

                return new LoginResponse("Password Doesn't Match", false);
            }
        }else {
            return new LoginResponse("Email Doesn't exists", false);
        }
    }

}
