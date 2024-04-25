package com.mic.emailservice.core;

public interface EmailSenderUserCase {
    void sendEmail (String to, String subjetct, String body);

}
