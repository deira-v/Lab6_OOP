package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setUp()
    {
        account = new BankAccount();
    }

    @Test
    void constructorInit(){
        account = new BankAccount("ACC123", "Deira", 100);
        assertEquals("ACC123", account.getAccNum());
        assertEquals("Deira", account.getName());
        assertEquals(100, account.getBalance());
    }

    @Test
    void constructorNegativeInit(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new BankAccount("ACC123", "Deira", -100));
        assertEquals("Negative balance is not allowed.", ex.getMessage());
    }

}
