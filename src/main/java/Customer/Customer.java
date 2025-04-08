package Customer;

public class Customer {
    private String firstName;
    private String lastName;
    private int customerId;
    private String address;
    public Customer(String cole, String palmer, String number, String london) {
    }
    {
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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
