package Customer;

public class Customer {
    private String firstName;
    private String lastName;
    private String customerId;
    private String address;
    public Customer(String firstName, String lastName, String customerId, String address) {
    }
    {
        if(!firstName.equals("Cole"))
        {
            throw new IllegalArgumentException("Invalid Customer First Name");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
