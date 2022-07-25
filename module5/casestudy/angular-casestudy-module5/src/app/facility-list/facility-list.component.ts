import {Component, OnInit} from '@angular/core';
import {Facility} from "../model/facility/facility";

@Component({
  selector: ' app-facility-list',
  templateUrl: './facility-list.component.html',
  styleUrls: ['./facility-list.component.css']
})
export class FacilityListComponent implements OnInit {
  facility: Facility[] = [];

  constructor() {
    this.facility.push({
        id: 0,
        nameFacility: 'Villa Beach Front',
        areaFacility: 25000,
        costFacility: 100,
        maxPeople: 10,
        standardRoom: 'vip',
        poolArea: 100,
        numberOfFloors: 10
      },
      {
        id: 1,
        nameFacility: 'Villa Beach Front',
        areaFacility: 20000,
        costFacility: 200,
        maxPeople: 10,
        standardRoom: 'normal',
        poolArea: 50,
        numberOfFloors: 15
      },

      {
        id: 2,
        nameFacility: 'Villa Beach Front',
        areaFacility: 30000,
        costFacility: 200,
        maxPeople: 10,
        standardRoom: 'vip',
        poolArea: 150,
        numberOfFloors: 20
      })

  }

  ngOnInit(): void {
  }

}
