package com.phuc.model;

public class MedicalDeclaration {
    private String name;
    private String birthday;
    private  String gender;
    private String nationality;
    private Integer idCard;
    private String vehicle;
    private String vehicleNumber;
    private Integer seats;
    private String departureDay;
    private String endDate;
    private String information;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String name, String birthday, String gender, String nationality, Integer idCard, String vehicle, String vehicleNumber, Integer seats, String departureDay, String endDate, String information) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.vehicle = vehicle;
        this.vehicleNumber = vehicleNumber;
        this.seats = seats;
        this.departureDay = departureDay;
        this.endDate = endDate;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(String departureDay) {
        this.departureDay = departureDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
