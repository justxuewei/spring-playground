package com.niuxuewei.springplayground.domain;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler({Exception.class})
    public Object handlerException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 100);
        map.put("message", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;
    }

    @ExceptionHandler(MyException.class)
    public Object handlerMyException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 101);
        map.put("message", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;
    }

}
