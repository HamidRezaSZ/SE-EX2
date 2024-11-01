package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;

public interface SmsMessageService {
    public void sendSmsMessage(SmsMessage smsMessage);
}

public interface EmailMessageService {
    public void sendEmailMessage(EmailMessage emailMessage);
}
