package case_study.common.validata;

public class ValidataFacility {

    private static final String SERVICE_CODE_VILLA = "^(SV)[VL]{2}-[0-9]{4}";
    private static final String SERVICE_CODE_HOUSE = "^(SV)[HO]{2}-[0-9]{4}";
    private static final String SERVICE_CODE_ROOM = "^(SV)[RO]{2}-[0-9]{4}";
    private static final String SERVICE_NAME = "^[A-Z][a-z]{1,}$";
    private static final String AREA = "^((([3-9][0-9])|([1-9][0-9]{2,}))\\.[0-9]{1,})$";
    private static final String RENTAL_COSTS = "^[0-9]+\\.[0-9]+$";
    private static final String PEOPLE_MAX = "^(([1-9])|([1][0-9])|[2][0])$";
    private static final String ROOM_STANDARD = "^[A-Z][a-z]{1,}$";
    private static final String NUMBER_OF_FLOORS_HOUSE ="^[0-9]+$";
    private static final String RENTAL_TYPE = "^[A-Z][a-z]{1,}$";



    public static boolean matchesServiceCodeVilla(String serviceCodeVilla) {
        return serviceCodeVilla.matches(SERVICE_CODE_VILLA);
    }
    public static boolean matchesServiceCodeHouse(String ServiceCodeHouse) {
        return ServiceCodeHouse.matches(SERVICE_CODE_HOUSE);
    }
    public static boolean matchesServiceCodeRoom(String serviceCodeRoom) {
        return serviceCodeRoom.matches(SERVICE_CODE_ROOM);
    }

    public static Boolean matchesServiceName(String serviceName){
        return serviceName.matches(SERVICE_NAME);
    }

    public static boolean matchesArea(String area){
        return area.matches(AREA);
    }

    public static boolean matchesRentalCosts(String rentalCosts){
        return rentalCosts.matches(RENTAL_COSTS);
    }

    public static boolean matchesPeopleMax(String peopleMax){
        return peopleMax.matches(PEOPLE_MAX);
    }

    public static boolean matchesNumberOfFloors(String numberOfFloors ){
        return numberOfFloors .matches(NUMBER_OF_FLOORS_HOUSE);
    }


    public static boolean matchesRoomStandard(String roomStandard){
        return roomStandard.matches(ROOM_STANDARD);
    }

    public static boolean matchesRentalType(String rentalType){
        return rentalType.matches(RENTAL_TYPE);
    }


}
