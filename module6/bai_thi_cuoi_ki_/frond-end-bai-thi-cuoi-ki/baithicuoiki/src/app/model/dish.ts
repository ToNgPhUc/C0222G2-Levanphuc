import {DishType} from './dish-type';

export interface Dish {
  id?: number,
  code?: string,
  name?: string,
  price?: number,
  image?: string,
  isDeleted?: boolean,
  dishType?: DishType
}
