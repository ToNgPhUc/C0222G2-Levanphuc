import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CardComponent} from './card.component';


const routes: Routes = [{
  path: 'card' , component: CardComponent
}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CardRoutingModule { }
