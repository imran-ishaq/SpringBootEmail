package com.imranscode.email.demo.controller;

import com.imranscode.email.demo.User;
import com.imranscode.email.demo.serviceimpl.MailServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmailController {
    @Autowired
    private MailServiceImplementation mail;
    @GetMapping("/publishJson")
    public String publishMessage(@RequestBody User user) {
        mail.sendSimpleMessage(user.getEmail(), "Spring boot demo Email", "Hi This is a test Email. \n\n Regards,//n Imran Ishaq");

        return "Email sent";
    }
}
