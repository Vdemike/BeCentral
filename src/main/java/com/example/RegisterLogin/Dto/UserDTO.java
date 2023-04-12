package com.example.RegisterLogin.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public class UserDTO {

    private int userid;
    private String username;
    private String userlastname;
    private String email;
    private String company;
    private String password;

    public UserDTO(int userid, String username, String userlastname, String email, String company, String password) {
        this.userid = userid;
        this.username = username;
        this.userlastname = userlastname;
        this.email = email;
        this.company = company;
        this.password = password;
    }
    public  UserDTO() {

    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserlastname() {
        return userlastname;
    }

    public void setUserlastname(String userlastname) {
        this.userlastname = userlastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userlastname='" + userlastname + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
