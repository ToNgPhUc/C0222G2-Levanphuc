import {SanPham} from './san-pham';

export interface LoHang {
  id: number,
  img:string
  maLoHang: string
  soLuong: number
  ngayNhapHang: string
  ngaySanXuat: string
  ngayHetHan: string
  sanPham: SanPham
}
