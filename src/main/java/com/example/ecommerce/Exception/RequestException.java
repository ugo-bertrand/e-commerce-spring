package com.example.ecommerce.Exception;

import org.springframework.http.HttpStatus;

public class RequestException extends Exception{
    private String message;

    public RequestException(String message){
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
