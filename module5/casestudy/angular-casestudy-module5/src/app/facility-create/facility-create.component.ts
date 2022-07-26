import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {RentType} from "../model/facility/rentType";
import {FacilityType} from "../model/facility/facilityType";

@Component({
  selector: 'app-facility-create',
  templateUrl: './facility-create.component.html',
  styleUrls: ['./facility-create.component.css']
})
export class FacilityCreateComponent implements OnInit {
  facilityForm: FormGroup;


  constructor() {
    this.facilityForm= new FormGroup({
      id: new FormControl(),
      nameFacility: new FormControl("",[Validators.required,Validators.pattern("^([A-z][a-z])$")]),
      areaFacility: new FormControl("",[Validators.required,Validators.pattern("^([0-9]){1,}$")]),
      costFacility: new FormControl("",[Validators.required]),
      maxPeople: new FormControl("",[Validators.required]),
      rentType: new FormControl("",[Validators.required]),
      facilityType: new FormControl("",[Validators.required]),
      kindOfRoom: new FormControl("",[Validators.required]),
      descriptionOtherConvenience: new FormControl("",[Validators.required]),
      poolArea: new FormControl("",[Validators.required]),
      numberOfFloors: new FormControl("",[Validators.required,Validators.pattern("^([0-9]){1,}$")]),
      facilityFree: new FormControl("",[Validators.required])
    })
  }

  ngOnInit(): void {
  }

  createFacility() {
    console.log(this.facilityForm)
  }
}
