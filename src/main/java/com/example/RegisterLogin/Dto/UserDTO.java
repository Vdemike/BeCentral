package com.example.RegisterLogin.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public class UserDTO {

    private int userid;
    private String firstName;
    private String lastName;
    private String email;
    private String company;
    private String password;

    public UserDTO(int userid, String firstName, String lastName, String email, String company, String password) {
        this.userid = userid;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
