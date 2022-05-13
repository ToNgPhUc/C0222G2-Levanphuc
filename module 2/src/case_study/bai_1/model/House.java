package case_study.bai_1.model;

import java.util.Objects;

public class House extends Facility {
    private String roomStandard;
    private Integer numberOfFloors;

    public House(String roomStandard, Integer numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceCode, String serviceName, Double area, Double rentalCosts, Integer maximumNumberOfPeople, String rentalType, String roomStandard, Integer numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House: " + super.toString() +
                ",roomStandard: " + roomStandard +
                ", numberOfFloors: " + numberOfFloors ;
    }

    @Override
    public String getInFor1() {
        return super.getInFor1()+","+this.roomStandard+","+this.numberOfFloors;
    }

}
