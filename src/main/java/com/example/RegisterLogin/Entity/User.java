package com.example.RegisterLogin.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
@Table(name = "user")

@Entity
public class User {

    @Id
    @Column(name="user_id", length = 11)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;

    @Column(name="firstName", length = 55)
    private String firstName;

    @Column(name="lastName", length = 55)
    private String lastName;

    @Column(name="email", length = 55)
    private String email;

    @Column(name="company", length = 55)
    private String company;

    @Column(name="password", length = 155)
    private String password;


    public User() {
    }

    public User(int userid, String firstName, String lastName, String company, String email, String password) {
        this.userid = userid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.company = company;
        this.password = password;
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
        return "User{" +
                "userid=" + userid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
