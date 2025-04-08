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
        if(lastName == null || lastName.length() <3)
        {
            throw new IllegalArgumentException("Invalid lastName length");
        }
        if(customerId == null || lastName.length() <8)
        {
            throw new IllegalArgumentException("Invalid customerId length");
        }
        if(address.equals("LondonVille") || address.length() <10)
        {
            throw new IllegalArgumentException("Invalid address");
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
