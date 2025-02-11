package com.nhnacademy.edu.springframework.message_sender;

import com.nhnacademy.edu.springframework.User;
import org.springframework.stereotype.Component;

public class SmsMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Sms Message Sent to " + user.getPhoneNumber() + " : " + message);
    }
}
