import {LoaiSanPham} from './loai-san-pham';

export interface SanPham {

  id?: number
  maSanPham?: string
  tenSanPham?: string
  gia?: number
  tinhTrang?:string
  ngayNhap?: string
  xuatXu?: string
  banhNgotMan?: string
  tacGia?: string
  theLoai?: string
  ngayXuatBan?:string
  loaiSanPham?: LoaiSanPham



}
