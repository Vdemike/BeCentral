package com.example.RegisterLogin.response;

public class loginResponse {

    String message;
    boolean status;

    public loginResponse(String message, boolean status) {
        this.message = message;
        this.status = status;
    }

    public loginResponse() {
    }

    public String getMessage() {
        return message;
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
        return "loginResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }

}
