package com.mblin.oo.tinyweb.example;

import com.mblin.oo.tinyweb.Filter;
import com.mblin.oo.tinyweb.HttpRequest;

public class LoggingFilter implements Filter {

    @Override
    public HttpRequest doFilter(HttpRequest request) {
        System.out.println("In Logging Filter - request for path: " + request.getPath());
        return request;
    }
}