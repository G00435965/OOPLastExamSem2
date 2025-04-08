import Customer.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCustomer {
    Customer myCust;

    @BeforeEach
    void setup()
    {
        myCust = new Customer("Cole","Palmer","20","London");
    }

    @Test
    void ConstructorSuccess()
    {
        assertEquals("Mr", myPass.getFirstName());
        assertEquals("Mr", myPass.getLastName());
        assertEquals("Mr", myPass.getCustomerId());
        assertEquals("Mr", myPass.getAddress());
    }

}
