package Exercise05DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {
        
        Notifier emailNotifier = new EmailNotifier();

        Notifier smsAndEmail = new SMSNotifierDecorator(emailNotifier);

        Notifier multiChannelNotifier = new SlackNotifierDecorator(smsAndEmail);

        multiChannelNotifier.send("System maintenance scheduled at 10 PM.");
    }
}
