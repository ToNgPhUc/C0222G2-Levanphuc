package case_study.bai_1.service;

import case_study.bai_1.model.Facility;

public interface IFacilityService extends InterfaceService {
    void displayFacilityManagement();

    void addListFacility(Facility facility);

    void facilityManagementCheck(Facility facility);

}
