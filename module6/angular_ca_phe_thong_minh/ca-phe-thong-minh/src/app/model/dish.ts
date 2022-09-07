import {DishType} from './dish-type';

export interface Dish {
  id?: number,
  code?: string,
  price?: number,
  name?: string,
  creationDate?: string,
  image?: string,
  isDeleted?: boolean,
  dishType?: DishType
}
