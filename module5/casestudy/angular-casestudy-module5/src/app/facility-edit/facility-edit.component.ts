import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-facility-edit',
  templateUrl: './facility-edit.component.html',
  styleUrls: ['./facility-edit.component.css']
})
export class FacilityEditComponent implements OnInit {

  facilityForm: FormGroup;


  constructor() {
    this.facilityForm = new FormGroup({
      id: new FormControl(),
      nameFacility: new FormControl("", [Validators.required, Validators.pattern("^([A-z][a-z])$")]),
      areaFacility: new FormControl("", [Validators.required, Validators.pattern("^([0-9]){1,}$")]),
      costFacility: new FormControl("", [Validators.required]),
      maxPeople: new FormControl("", [Validators.required]),
      rentType: new FormControl("", [Validators.required]),
      facilityType: new FormControl("", [Validators.required]),
      kindOfRoom: new FormControl("", [Validators.required]),
      descriptionOtherConvenience: new FormControl("", [Validators.required]),
      poolArea: new FormControl("", [Validators.required]),
      numberOfFloors: new FormControl("", [Validators.required, Validators.pattern("^([0-9]){1,}$")]),
      facilityFree: new FormControl("", [Validators.required])
    })
  }

  ngOnInit(): void {
  }

  editFacility() {
    console.log(this.facilityForm)

  }
}
