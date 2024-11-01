public class TelegramMessage implements MessageService{
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body!
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty Body!
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if(validateTelegramId(telegramMessage.getSourceTelegramId()) && validateTelegramId(telegramMessage.getTargetTelegramId())){
            System.out.println("Sending a Telegram message from " + telegramMessage.getSourceTelegramId() + " to " + telegramMessage.getTargetTelegramId() + " with content : " + telegramMessage.getContent());
        }else{
            throw new IllegalArgumentException("Telegram ID is Not Correct!");
        }
    }

    private boolean validateTelegramId(String telegramId) {
        if (telegramId.length() != 9) {
            return false;
        }

        for (char digit : telegramId.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false;
            }
        }

        return true;
    }
}