package com.mblin.oo.tinyweb;

public class ControllerException extends RuntimeException {
    private Integer statusCode;

    public ControllerException(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }
}