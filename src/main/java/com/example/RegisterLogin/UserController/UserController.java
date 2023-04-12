package com.example.RegisterLogin.UserController;

import com.example.RegisterLogin.response.LoginResponse;
import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Dto.UserDTO;
import com.example.RegisterLogin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")


public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(path = "/save")
    public String saveUser(@Validated @RequestBody UserDTO userDTO)
    {
        String id = userService.addUser(userDTO);
        return id;
    }


    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

}
