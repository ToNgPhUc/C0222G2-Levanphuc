package com.phuc.casestudy_module4_furamaresort.model.contract;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.phuc.casestudy_module4_furamaresort.model.customer.Customer;
import com.phuc.casestudy_module4_furamaresort.model.employee.Employee;
import com.phuc.casestudy_module4_furamaresort.model.facility.Facility;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String startDate;
    private String endDate;
    private Double deposit;
    @ManyToOne
    @JoinColumn(name = "customer",referencedColumnName = ("id"))
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "employee",referencedColumnName = ("id"))
    private Employee employee;
    @ManyToOne
    @JoinColumn(name="facility",referencedColumnName = ("id"))
    private Facility facility;
    @OneToMany(mappedBy = "contract")
    @JsonBackReference
    private List<ContractDetail> contractDetailList;

    public Contract() {
    }

    public Contract(Integer id, String startDate, String endDate, Double deposit, Customer customer, Employee employee, Facility facility, List<ContractDetail> contractDetailList) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.customer = customer;
        this.employee = employee;
        this.facility = facility;
        this.contractDetailList = contractDetailList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
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

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }
}
