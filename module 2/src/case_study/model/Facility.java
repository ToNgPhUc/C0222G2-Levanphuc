package case_study.model;

import java.util.Objects;

public abstract class Facility {      // facility: co so vat chat
    private String serviceCode;
    private String serviceName;
    private Double area;
    private Double rentalCosts;
    private Integer maximumNumberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, Double area, Double rentalCosts, Integer maximumNumberOfPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(Double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public Integer getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(Integer maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility: { " +
                "serviceCode: " + serviceCode +
                ", serviceName: " + serviceName +
                ", area: " + area +
                ", rentalCosts: " + rentalCosts +
                ", maximumNumberOfPeople: " + maximumNumberOfPeople +
                ", rentalType: " + rentalType;
    }

public String getInFor1(){
        return this.serviceCode+","+this.serviceName+","+this.area+","+this.rentalCosts+","+this.maximumNumberOfPeople+","+this.rentalType;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(serviceName, facility.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName);
    }
}
