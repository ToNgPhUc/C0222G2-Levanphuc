package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private Double swimmingPoolArea;
    private Integer numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, Double swimmingPoolArea, Integer numberOfFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceCode, String serviceName, Double area, Double rentalCosts, Integer maximumNumberOfPeople, String rentalType, String roomStandard, Double swimmingPoolArea, Integer numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public Double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(Double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                ",tieuChuanPhong: " + roomStandard + '\'' +
                ", dienTicHoBoi: " + swimmingPoolArea +
                ", soTang: " + numberOfFloors ;
    }

    @Override
    public String getInFor1() {
        return super.getInFor1()+","+this.roomStandard+","+this.swimmingPoolArea+","+this.numberOfFloors;
    }

}
