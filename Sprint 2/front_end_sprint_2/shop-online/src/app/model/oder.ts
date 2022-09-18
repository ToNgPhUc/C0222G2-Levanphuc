import {Bill} from './bill';
import {Customer} from './customer';
import {Product} from './product';

export interface Oder {
  id?:number ;
  quantity?:number ;
  code?: string ;
  bill?: Bill ;
  customer?: Customer ;
  product?: Product ;
}
