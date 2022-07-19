import { Component, OnInit } from '@angular/core';
import {Pet} from '../pet';

@Component({
  selector: 'app-pet',
  templateUrl: './pet.component.html',
  styleUrls: ['./pet.component.css']
})
export class PetComponent implements OnInit {
pet: Pet = {
  name: 'bug',
  imager: 'http://2.bp.blogspot.com/-Dm8ns6HJc9E/UFciSGY3yuI/AAAAAAAADuw/ahvXNdwYNOo/s1600/cho-con.jpg'
};
  constructor() { }

  ngOnInit(): void {
  }

}
