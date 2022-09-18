import {AppUser} from './app-user';

export interface Customer {
  id?: number ;
  name?:string ;
  email?: string ;
  address?: string ;
  phoneNumber?: string ;
  appUser?: AppUser ;

}
