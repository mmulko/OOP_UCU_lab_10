package mail_types;

import lombok.Getter;
import lombok.Setter;

import static mail_types.ClientIDGenerator.generateClientID;

@Getter @Setter
public class Client {
    private final int id;
    private String name;
    private int age;
    private Gender sex;

    private Client() {
        this.id = generateClientID();
    }

    public static class ClientIDGenerator {
        private static int counter = 0;

        public static int generateClientID() {
            counter++;
            return counter;
        }
    }
}
