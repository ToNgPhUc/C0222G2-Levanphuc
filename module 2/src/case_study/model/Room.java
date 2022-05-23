package case_study.model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, Double area, Double rentalCosts, Integer maximumNumberOfPeople, String rentalType, String freeService) {
        super(serviceCode, serviceName, area, rentalCosts, maximumNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room: " + super.toString() +
                ",freeService: " + freeService ;
    }

    @Override
    public String getInFor1() {
        return super.getInFor1()+","+this.freeService;
    }

}
