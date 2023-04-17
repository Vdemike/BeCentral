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

import java.util.HashMap;
import java.util.Map;
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
                    String firstName = user.get().getFirstName();
                    String lastName = user.get().getLastName();
                    String userId = String.valueOf(user.get().getUserid());
                    String email = user.get().getEmail();
                    String welcomeMsg = "Login Success! Welcome, " + firstName + " " + lastName + "! Your UserID is " + userId;
                    Map<String, String> userDetails = new HashMap<>();
                    userDetails.put("firstName", firstName);
                    userDetails.put("lastName", lastName);
                    userDetails.put("userID", userId);
                    userDetails.put("email", email);

                    String[] detailsArray = userDetails.values().toArray(new String[0]);

                    return new LoginResponse(welcomeMsg, true, (String[]) detailsArray);
                } else {
                    return new LoginResponse("Login Failed", false, "Not Logged in");
                }
            } else {
                return new LoginResponse("Password Doesn't Match", false, "No details");
            }
        } else {
            return new LoginResponse("Email Doesn't Exist", false, "No details");
        }
    }

}
