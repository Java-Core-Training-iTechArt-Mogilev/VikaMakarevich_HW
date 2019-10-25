package com.best.qa.lesson5.sender;

import com.best.qa.lesson5.message.Message;

public class Sender implements SenderService {
    private Message message;

    public Sender(Message message) {
        this.message = message;
    }

    public void sendMessage(String message, String recipient) {
        this.message.createMessage(message, recipient);
    }
}
