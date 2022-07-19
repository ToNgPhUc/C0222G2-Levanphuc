import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  numberOne :string
  numberTwo: string
  result = 0;
  error = '';

  calculator(operand: string) {
    switch (operand) {
      case '+': {

        this.result = (parseInt(this.numberOne) + parseInt(this.numberTwo));
        break;
      }
      case '-': {
        this.result = (parseInt(this.numberOne) - parseInt(this.numberTwo));
        break;
      }
      case '*': {

        this.result = (parseInt(this.numberOne) * parseInt(this.numberTwo));
        break;
      }
      case '/': {
        if (parseInt(this.numberTwo)!=0){
          this.result = parseInt(this.numberOne) / parseInt(this.numberTwo);
          break;
        }else {
          this.error= "mẫu số không được bằng 0"
        }
      }
    }


  // result = 0;
  // error = '';
  //
  // calculator(numberOne :string, numberTwo: string, operand: string) {
  //   switch (operand) {
  //     case '+': {
  //
  //       this.result = (parseInt(numberOne) + parseInt(numberTwo));
  //       break;
  //     }
  //     case '-': {
  //       this.result = (parseInt(numberOne) - parseInt(numberTwo));
  //       break;
  //     }
  //     case '*': {
  //
  //       this.result = (parseInt(numberOne) * parseInt(numberTwo));
  //       break;
  //     }
  //     case '/': {
  //       if (parseInt(numberTwo)!=0){
  //         this.result = parseInt(numberOne) / parseInt(numberTwo);
  //         break;
  //       }else {
  //         this.error= "mẫu số không được bằng 0"
  //       }
  //     }
  //   }
  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
