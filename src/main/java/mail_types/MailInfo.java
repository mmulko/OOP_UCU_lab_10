package mail_types;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@Getter @AllArgsConstructor
public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public String getMailText() {
        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME", client.getName());
        templates.put("%AGE", Integer.toString(client.getAge()));
        for (String key : templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }

    public String getName() {
        return client.getName();
    }
}
