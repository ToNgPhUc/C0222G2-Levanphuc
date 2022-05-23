package case_study.model;

public class Customer extends Person implements Comparable<Customer> {
    private String customerCode;
    private String typeOfGuest;
    private String address;

    public Customer(String name, String dateOfBirth, String gender, Integer identityCardNumber, Integer phoneNumber, String email) {
        super(name, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
    }

    public Customer(String name, String dateOfBirth, String gender, Integer identityCardNumber, Integer phoneNumber, String email, String customerCode, String typeOfGuest, String address) {
        super(name, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer: " + super.toString() +
                ",customerCode: " + customerCode +
                ",typeOfGuest: " + typeOfGuest +
                ",address: " + address;
    }

    @Override
    public String getInFor() {
        return super.getInFor() + "," + this.customerCode + "," + this.typeOfGuest + "," + this.address;
    }

    @Override
    public int compareTo(Customer o) {
        return this.getIdentityCardNumber() - o.getIdentityCardNumber();
    }
}