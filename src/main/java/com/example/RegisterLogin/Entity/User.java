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

    @Column(name="user_name", length = 55)
    private String username;

    @Column(name="user_lastname", length = 55)
    private String userlastname;

    @Column(name="email", length = 55)
    private String email;

    @Column(name="company", length = 55)
    private String company;

    @Column(name="password", length = 155)
    private String password;


    public User() {
    }

    public User(int userid, String username, String userlastname, String company, String email, String password) {
        this.userid = userid;
        this.username = username;
        this.userlastname = userlastname;
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
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userlastname='" + userlastname + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
