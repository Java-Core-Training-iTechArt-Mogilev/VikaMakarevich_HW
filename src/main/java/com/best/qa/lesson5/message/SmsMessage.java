package com.best.qa.lesson5.message;

public class SmsMessage implements Message {

    public void createMessage(String message, String recipient) {
        System.out.println("To: " + recipient + "\n" + "Sms message: " + message);
    }
}
