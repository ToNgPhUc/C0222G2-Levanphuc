import {Component, OnInit} from '@angular/core';
import {TuDien} from '../../model/tu-dien';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {TuDienService} from '../../service/tu-dien.service';

@Component({
  selector: 'app-chi-tiet-tu-dien',
  templateUrl: './chi-tiet-tu-dien.component.html',
  styleUrls: ['./chi-tiet-tu-dien.component.css']
})
export class ChiTietTuDienComponent implements OnInit {
  tuDien: TuDien = {};

  constructor(private activatedRoute: ActivatedRoute, private tuDienService: TuDienService) {
    activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
        const id = paramMap.get('id');
        this.tuDien = this.tuDienService.findById(parseInt(id))[0];
      }, error => {

      }, () => {
        console.log('hoan thanh');
      }
    );
  }

  ngOnInit(): void {
  }

}
