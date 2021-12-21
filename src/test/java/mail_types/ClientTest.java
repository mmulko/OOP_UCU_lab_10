package mail_types;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client = new Client("Mykhailo", Gender.MALE, 18);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals(client.getName(), "Mykhailo");
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(client.getAge(), 18);
    }

    @org.junit.jupiter.api.Test
    void getSex() {
        assertEquals(client.getSex(), Gender.MALE);
    }
}