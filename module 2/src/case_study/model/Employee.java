package case_study.model;

public class Employee extends Person  {
    private String employeeCode;
    private String level;
    private String location;
    private Double wage;


    public Employee() {
    }

    public Employee(String name, String dateOfBirth, String gender, Integer identityCardNumber, Integer phoneNumber, String email, String employeeCode, String level, String location, Double wage) {
        super(name, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getWage() {
        return wage;
    }



    public void setWage(Double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() + "," +
                "employeeCode: " + employeeCode + ',' +
                "level: " + level + ',' +
                "location: " + location + ',' +
                "wage: " + wage;
    }

    @Override
    public String getInFor() {
        return super.getInFor() + "," + this.employeeCode + "," +  this.level + "," + this.location + "," + this.wage;
    }
}
