package com.mailverifier.customerapiproject.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class loginhandler {
    @GetMapping
   public String login() {
        return "login";
    }


}
