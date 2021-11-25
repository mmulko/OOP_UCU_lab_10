package mail_types;

public class ClientIDGenerator {
    private static int counter = 0;

    public static int generateClientID() {
        counter++;
        return counter;
    }
}
