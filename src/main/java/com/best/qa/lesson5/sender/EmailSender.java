package com.best.qa.lesson5.sender;

import com.best.qa.lesson5.message.EmailMessage;

public class EmailSender implements SenderType {

    public SenderService getSenderType() {
        return new Sender(new EmailMessage());
    }
}
