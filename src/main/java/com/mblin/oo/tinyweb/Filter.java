package com.mblin.oo.tinyweb;

public interface Filter {
    HttpRequest doFilter(HttpRequest request);
}