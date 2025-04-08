import Customer.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnitCustomerTest {
    Customer myCust;

    @BeforeEach
    void setup()
    {
        myCust = new Customer("Cole","Palmer","abcdefghij","LondonVille");
    }

    @Test
    void ConstructorSuccess()
    {
        assertEquals("Cole", myCust.getFirstName());
        assertEquals("Palmer", myCust.getLastName());
        assertEquals("abcdefghij", myCust.getCustomerId());
        assertEquals("LondonVille", myCust.getAddress());
    }

    @Test
    void testFirstName()
    {
        assertThrows(IllegalAccessException.class, () -> {new Customer("Cold", "Palmer", "abcdefghij", "LondonVille");});
    }

    @Test
    void testFirstNameSuccess()
    {
        assertEquals("Cole",myCust.getFirstName());
    }

    @Test
    void testFirstNameFail()
    {
        assertThrows(IllegalAccessException.class, () -> {new Customer("Cold", "Palmer", "abcdefghij", "LondonVille");});
        assertDoesNotThrow(IllegalAccessException.class, () -> {new Customer("", "Palmer", "abcdefghij", "LondonVille");});
    }

    @Test
    void testShortFirst()
    {
        assertThrows(IllegalArgumentException.class, () -> {
            new Customer("Cole", "Pammer", "abcdefghij", "LondonVille");});

    }

    Exception ex = assertThrows assertEquals("Invaliddd lastName length", ex.getMessage());

}

    @Test
    void testShortSecond()
    {
        assertThrows(IllegalArgumentException.class, () -> {
            new Customer("Cole", "Palmer", "", "LondonVille");});

    }

    Exception ex = assertThrows assertEquals("Inwalid customerId length", ex.getMessage());

        }
