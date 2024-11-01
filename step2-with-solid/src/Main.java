import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.services.EmailMessageService;
import edu.sharif.selab.services.MessageService;
import edu.sharif.selab.services.SmsMessageService;
import edu.sharif.selab.factories.MessageFactory;
import edu.sharif.selab.factories.ServiceFactory;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");
            MessageFactory messageFactory = new MessageFactory();
            ServiceFactory serviceFactory = new ServiceFactory();
            String target;
            String content;

            System.out.println("In order to send Sms message enter 1");
            System.out.println("In order to send Email message enter 2");
            System.out.println("In order to Exit, Enter 0");

            userAnswer= scanner.nextInt();

            if(userAnswer==0){
                break;
            }

            switch (userAnswer){
                case 1:
                    SmsMessage smsMessage = new SmsMessage();
                    message = messageFactory.createMessage("SMS");
                    System.out.print("Enter source phone : ");
                    ((SmsMessage) message).setSourcePhoneNumber(scanner.next());
                    System.out.print("Enter target phone : ");
                    ((SmsMessage) message).setTargetPhoneNumber(scanner.next());
                    System.out.println("Write Your Message : ");
                    ((SmsMessage) message).setContent(scanner.next(".*$"));
                case 2:
                    EmailMessage emailMessage = new EmailMessage();
                    System.out.print("Enter source phone : ");
                    source = scanner.next();
                    emailMessage.setSourceEmailAddress(source);
                    System.out.print("Enter target phone : ");
                    message = messageFactory.createMessage("EMAIL");
                    System.out.print("Enter source email : ");
                    ((EmailMessage) message).setSourceEmailAddress(scanner.next());
                    System.out.print("Enter target email : ");
                    ((EmailMessage) message).setTargetEmailAddress(scanner.next());
                    System.out.println("Write Your Message : ");
                    ((EmailMessage) message).setContent(scanner.next());
                messageService.sendSmsMessage((SmsMessage) message);
            }else if(message instanceof EmailMessage){
                messageService = new EmailMessageService();
                messageService.sendEmailMessage((EmailMessage) message);
            }

        }while (true);
            messageService = serviceFactory.createService(message);
            messageService.sendMessage(message);
}