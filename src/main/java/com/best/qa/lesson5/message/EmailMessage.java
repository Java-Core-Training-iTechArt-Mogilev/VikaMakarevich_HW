package com.best.qa.lesson5.message;

public class EmailMessage implements Message {

    public void createMessage(String message, String recipient) {
        System.out.println("To: " + recipient + "\n" + "Email message: " + message);
    }
}
