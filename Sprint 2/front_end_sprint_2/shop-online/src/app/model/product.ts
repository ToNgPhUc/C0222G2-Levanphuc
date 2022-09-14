import {TypeProduct} from './type-product';

export interface Product {
  id?: number,
  code?: string
  name?: string;
  price?: number;
  image?: string;
  isDeleted?: boolean;
  specification?: string;
  productDescription?: string;
  origin?: string;
  quantity?: number
  creationDate?: string
  typeProduct?: TypeProduct
}
