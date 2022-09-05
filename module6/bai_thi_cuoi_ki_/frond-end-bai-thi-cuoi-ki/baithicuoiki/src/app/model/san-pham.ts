import {LoaiSanPham} from './loai-san-pham';

export interface SanPham {
  // this.id = id;
  // this.maSanPham = maSanPham;
  // this.tenSanPham = tenSanPham;
  // this.gia = gia;
  // this.tinhTrang = tinhTrang;
  // this.ngayNhap = ngayNhap;
  // this.xuatXu = xuatXu;
  // this.banhNgotMan = banhNgotMan;
  // this.tacGia = tacGia;
  // this.theLoai = theLoai;
  // this.ngayXuatBan = ngayXuatBan;
  // this.loaiSanPham = loaiSanPham;
  // this.dishOrderList = dishOrderList;
  id?: number
  maSanPham?: string
  tenSanPham?: string
  gia?: number
  tinhTrang?:boolean
  ngayNhap?: string
  xuatXu?: string
  banhNgotMan?: string
  tacGia?: string
  theLoai?: string
  ngayXuatBan?:string
  loaiSanPham?: LoaiSanPham



}
