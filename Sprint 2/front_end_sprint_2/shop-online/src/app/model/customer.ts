import {AppUser} from './app-user';

export interface Customer {
  id?: number ;
  name?:string ;
  email?: string ;
  address?: string ;
  phoneNumber?: string ;
  age?: number ;
  image?: string ;
  gender?: number ;
  appUser?: AppUser ;

}
