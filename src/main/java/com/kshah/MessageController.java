package com.kshah;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Value("${app2.property.abc}")
    private String message;

    @RequestMapping("/message")
    public String getMessage() {
        return message;
    }
}
