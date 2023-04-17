package com.example.RegisterLogin.response;
import java.util.Arrays;

public class LoginResponse {

    String message;
    String details;
    boolean status;

    public LoginResponse(String message, boolean status, String details) {
        this.message = message;
        this.status = status;
        this.details = details;
    }

    public LoginResponse() {
    }

    public LoginResponse(String welcomeMsg, boolean status, String[] detailsArray) {
        this.message = welcomeMsg;
        this.status = status;
        this.details = Arrays.toString(detailsArray);
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", details='" + details +
                '}';
    }

}
