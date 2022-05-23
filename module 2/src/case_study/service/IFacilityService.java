package case_study.service;

import case_study.model.Facility;

public interface IFacilityService extends InterfaceService {
    void displayFacilityManagement();

    void addListFacility(Facility facility);

    void facilityManagementCheck(Facility facility);

}
