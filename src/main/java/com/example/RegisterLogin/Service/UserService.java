package com.example.RegisterLogin.Service;

import com.example.RegisterLogin.Dto.LoginDTO;
import com.example.RegisterLogin.Dto.UserDTO;

public interface UserService {

    String addUser(UserDTO userDTO);

    loginMessage loginUser(LoginDTO loginDTO);
}
