drop database if exists quan_li_hang_xuat_nhap;
create database if not exists quan_li_hang_xuat_nhap;

use quan_li_hang_xuat_nhap;

create table phieu_xuat(
so_phieu_xuat int auto_increment primary key,
ngay_xuat Datetime
);
create table phieu_nhap(
so_phieu_nhap int primary key,
ngay_nhap datetime
);
create table nha_cung_cap(
ma_nha_cung_cap varchar (100) primary key ,
ten_nha_cung_cap varchar (100),
dia_chi varchar (100)
);
create table don_dat_hang(
so_don_hang int primary key,
ngay_don_hang datetime ,
ma_nha_cung_cap varchar (100),
foreign key (ma_nha_cung_cap)references nha_cung_cap(ma_nha_cung_cap)
);
create table dien_thoai(
so_dien_thoai varchar (10),
ma_nha_cung_cap varchar (100),
foreign key (ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap)
 );
create table vat_tu(
ma_vat_tu varchar (100) primary key,
ten_vat_tu varchar (100)
);
create table chi_tiet_don_dat_hang(
ma_vat_tu varchar (100),
so_don_hang int,
foreign key (ma_vat_tu)references vat_tu(ma_vat_tu),
foreign key (so_don_hang) references don_dat_hang(so_don_hang)
);
create table chi_tiet_phieu_xuat(
don_gia_xuat int,
so_luong_san_xuat int,
so_phieu_xuat int,
ma_vat_tu varchar(100),
foreign key (so_phieu_xuat) references phieu_xuat(so_phieu_xuat),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu) 
);
create table chi_tiet_phieu_nhap(
don_gia_nhap int,
so_luong_nhap int,
ma_vat_tu varchar(100),
so_phieu_nhap int,
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_phieu_nhap) references phieu_nhap(so_phieu_nhap)
);


