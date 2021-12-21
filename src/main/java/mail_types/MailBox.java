package mail_types;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MailBox {

    private final List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        MailSender mailSender = new MailSender();
        for (MailInfo mailInfo: infos) {
            mailSender.sendMail(mailInfo);
        }
        infos.clear();
    }
}
