package mail_types;

import java.util.HashMap;

public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public String getMailText() {
        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        // Iterate over all keys and replace a specific template
        for (String key : templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }
}
