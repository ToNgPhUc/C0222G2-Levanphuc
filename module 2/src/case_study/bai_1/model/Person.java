package case_study.bai_1.model;

public abstract class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private Integer identityCardNumber;
    private Integer phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, String dateOfBirth, String gender, Integer identityCardNumber, Integer phoneNumber, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(Integer identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name: " + name + ',' +
                " dateOfBirth: " + dateOfBirth + ',' +
                " gender: " + gender + ',' +
                " identityCardNumber: " + identityCardNumber +',' +
                " phoneNumber: " + phoneNumber +',' +
                " email: " + email ;
    }

    public String getInFor() {
        return this.name + "," + this.dateOfBirth + "," + this.gender + "," + this.identityCardNumber + "," + this.phoneNumber + "," + this.email;
    }
}
