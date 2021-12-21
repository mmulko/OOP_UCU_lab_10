package mail_types;

public class MailSender {
    public void sendMail(MailInfo info) {
        System.out.println("Message ["+info.getMailText()+"] just sent to '"+info.getName()+"'\n");
    }
}
