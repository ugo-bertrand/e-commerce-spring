package com.example.ecommerce.Exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends RequestException{

    private int status;

    public BadRequestException(String message) {
        super(message);
        this.status = HttpStatus.BAD_REQUEST.value();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
