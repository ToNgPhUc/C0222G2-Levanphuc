import {CustomerType} from "./customerType";

export interface Customer {
  id?: number,
  nameCustomer?: string,
  dateOfBirth?: string,
  gender?: number,
  idCard?: string,
  phoneNumber?: string,
  email?: string,
  address?: string,
  customerType?: CustomerType
}
