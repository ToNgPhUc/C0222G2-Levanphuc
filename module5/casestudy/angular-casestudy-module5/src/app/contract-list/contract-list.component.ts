import {Component, OnInit} from '@angular/core';
import {Contract} from "../model/contract/contract";

@Component({
  selector: 'app-contract-list',
  templateUrl: './contract-list.component.html',
  styleUrls: ['./contract-list.component.css']
})
export class ContractListComponent implements OnInit {
  contract: Contract[] = []

  constructor() {
    this.contract.push({
      id: 0,
      startDate: '14-02-1995',
      endDate: '14-03-1995',
      deposit: 100
    },
      {
        id: 1,
        startDate: '14-02-1996',
        endDate: '14-03-1996',
        deposit: 1000
      },
      {
        id: 2,
        startDate: '14-02-1997',
        endDate: '14-04-1997',
        deposit: 10000
      })
  }

  ngOnInit(): void {
  }

}
