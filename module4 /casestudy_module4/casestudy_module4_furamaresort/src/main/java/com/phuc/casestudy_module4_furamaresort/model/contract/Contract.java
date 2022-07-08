package com.phuc.casestudy_module4_furamaresort.model.contract;

import com.phuc.casestudy_module4_furamaresort.model.customer.Customer;
import com.phuc.casestudy_module4_furamaresort.model.employee.Employee;
import com.phuc.casestudy_module4_furamaresort.model.facility.Facility;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Contract {
    private Integer idContract;
    private String startDate;
    private String endDate;
    private String deposit;
    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = ("customer_id"))
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = ("employee_id"))
    private Employee employee;
    @ManyToOne
    @JoinColumn(name="facility_id",referencedColumnName = ("facility_id"))
    private Facility facility;

    public Contract() {
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
}
