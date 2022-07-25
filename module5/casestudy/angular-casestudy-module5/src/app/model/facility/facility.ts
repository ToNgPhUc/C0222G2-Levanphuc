import {RentType} from "./rentType";
import {FacilityType} from "./facilityType";

export interface Facility {
  id?: number
  nameFacility?: string,
  areaFacility?: number,
  costFacility?: number,
  maxPeople?: number,
  // rentType?: RentType,
  // facilityType?: FacilityType,
  standardRoom?: string,
  descriptionOtherConvenience?: string
  poolArea?: number
  numberOfFloors?: number
  facilityFree?: string
}
