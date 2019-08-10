package com.sssionizr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pong {

    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public String handleRequest() {
        return "pong";
    }
}
