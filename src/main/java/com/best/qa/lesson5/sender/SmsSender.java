package com.best.qa.lesson5.sender;

import com.best.qa.lesson5.message.SmsMessage;

public class SmsSender implements SenderType {

    public SenderService getSenderType() {
        return new Sender(new SmsMessage());
    }
}
