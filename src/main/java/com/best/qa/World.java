package com.best.qa;

import com.best.qa.lesson5.sender.EmailSender;
import com.best.qa.lesson5.sender.SenderService;
import com.best.qa.lesson5.sender.SenderType;
import com.best.qa.lesson5.sender.SmsSender;

public class World {

    public static void main(String[] args) {
        SenderType senderType;
        SenderService senderService;
        String messageText = "Hello world!";
        String recipient = "Vika";

        senderType = new EmailSender();
        senderService = senderType.getSenderType();
        senderService.sendMessage(messageText, recipient);

        senderType = new SmsSender();
        senderService = senderType.getSenderType();
        senderService.sendMessage(messageText, recipient);

        System.out.println("Hello World");
    }
}
