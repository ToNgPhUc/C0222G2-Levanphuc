drop database if exists furama_resort;
create database furama_resort;

use furama_resort;

create table vi_tri(
	ma_vi_tri int,
    ten_vi_tri varchar(45),
    primary key(ma_vi_tri)
);


create table trinh_do(
	ma_trinh_do int,
    ten_trinh_do varchar(45),
    primary key(ma_trinh_do)
);

create table bo_phan(
	ma_bo_phan int,
    ten_bo_phan varchar(45),
    primary key(ma_bo_phan)
);

create table nhan_vien(
	ma_nhan_vien int,
    ho_va_ten varchar(45),
    ngay_sinh date,
    so_cmnd varchar(45),
    luong double,
	so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    ma_vi_tri int,
    ma_trinh_do int,
    ma_bo_phan int,
    foreign key(ma_vi_tri) references vi_tri(ma_vi_tri),
    foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
    foreign key(ma_bo_phan) references bo_phan(ma_bo_phan),
    primary key(ma_nhan_vien)
);

create table loai_khach(
	ma_loai_khach int,
    ten_loai_khach varchar(45),
    primary key(ma_loai_khach)
);

create table khach_hang(
	ma_khach_hang int,
     ma_loai_khach int,
    foreign key(ma_loai_khach) references loai_khach(ma_loai_khach),
    ho_ten varchar(45),
    ngay_sinh date,
    gioi_tinh bit(1),
    so_cmnd varchar(45),
    so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    primary key(ma_khach_hang)
);

create table loai_dich_vu(
	ma_loai_dich_vu int,
    ten_loai_dich_vu varchar(45),
    primary key(ma_loai_dich_vu)
);

create table kieu_thue(
	ma_kieu_thue int,
    ten_kieu_thue varchar(45),
    primary key(ma_kieu_thue)
);

create table dich_vu(
	ma_dich_vu int,
    ten_dich_vu varchar(45),
    dien_tich int,
    chi_phi_thue double,
    so_nguoi_toi_da int,
    ma_kieu_thue int,
    ma_loai_dich_vu int,
    foreign key(ma_kieu_thue) references kieu_thue(ma_kieu_thue),
    foreign key(ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu),
    tieu_chuan_phong varchar(45),
    mo_ta_tien_nghi_khac varchar(45),
    dien_tich_ho_boi double,
    so_tang int,
    primary key(ma_dich_vu)
);

create table hop_dong(
	ma_hop_dong int,
    ngay_lam_hop_dong datetime,
    ngay_ket_thuc datetime,
    tien_dat_coc double,
    ma_nhan_vien int,
    ma_khach_hang int,
    ma_dich_vu int,
    foreign key(ma_nhan_vien) references nhan_vien(ma_nhan_vien),
    foreign key(ma_khach_hang) references khach_hang(ma_khach_hang),
    foreign key(ma_dich_vu) references dich_vu(ma_dich_vu),
    primary key(ma_hop_dong)
);


create table dich_vu_di_kem(
	ma_dich_vu_di_kem int,
    ten_dich_vu_di_kem varchar(45),
    gia double,
    don_vi varchar(10),
    trang_thai varchar(45),
    primary key(ma_dich_vu_di_kem)
);

create table hop_dong_chi_tiet(
	ma_hop_dong_chi_tiet int,
    ma_hop_dong int,
    ma_dich_vu_di_kem int,
    foreign key(ma_hop_dong) references hop_dong(ma_hop_dong),
    foreign key(ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem),
    so_luong int,
    primary key(ma_hop_dong_chi_tiet)
);
insert into vi_tri(ma_vi_tri,ten_vi_tri) values (1,'quan Lý'),(2,'nhân viên');
insert into trinh_do (ma_trinh_do,ten_trinh_do) values (1,'trung cấp'),(2,'cao đẳng'),(3, 'đại học'),(4, ' sau đại học');
insert into bo_phan(ma_bo_phan,ten_bo_phan) values (1,'Sale-Marketing'),(2,'Hành chính'),(3,'phục vụ'),(4, 'Quan Lý');
insert into nhan_vien(ma_nhan_vien,ho_va_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan) values 
 (1,'Nguyễn Văn An','19701107',456231786,10000000,0901234121,'annguyen@gmail.com','295 nguyễn tất thành ,đà dẵng',1,3,1),
(2,'Lê văn Bình','19970409',654231234,7000000,0934212314,'binhlv@gmail.com','22 yên bái Đà nẵng',1,2,2),
(3,'Hồ Thị Yến','19951212',999231723,14000000,0412352315,'thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2),
 (4,'Võ Công Toản','19800404',123231365,17000000,0374443232,'toan0404gmail.com','77 Hoàng Diệu, Quảng Trị',1,4,4),
 (5,'Nguyễn Bỉnh Phát','19991209',454363232,6000000,0902341231,'phatphatgmail.com','43 yên bái đà nẵng',2,1,1),
 (6,'Khúc Nguyễn An Nghi','20001108',964542311,7000000,0978653213,'annghi20@gmail.com','294 nguyễn tất thành, đà nẵng',2,2,3),
 (7,'Nguyễn Hữu Hà','19930101',534323231,8000000,0941234553,'nhh0101@gmail.com','4 nguyễn chí thanh,Huế',2,3,2),
 (8,'Nguyễn Hà Đông','19890903',234414123,9000000,0642123111,'donghanguyen@gmail.com','111 Hùng Vương, Hà Nội',2,4,4),
 (9,'Tòng Hoang','19820903',256781231,6000000,0245144444,'hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4),
 (10,'Nguyễn Công Đạo','19940108',755434343,8000000,0988767111,'nguyencongdao12@gmail.com','Hòa Khánh, Đồng Nai',2,3,2);
 insert into loai_khach(ma_loai_khach,ten_loai_khach)values(1,'Diamond'),(2,'platinium'),(3,'gold'),(4,'silver'),(5,'member');
 insert into khach_hang(ma_khach_hang,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi,ma_loai_khach) values
 (1,'Nguyễn Thị Hào','19701107',0,'643431213','0945423362','thihao07@gmail.com','23 Nguyễn hoàng, Đà Nẵng',5),
 (2,'Phạm Xuân Diệu','19920808',1,'865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị',3),
 (3,'Trương Đình Nghệ','19900227',1,'488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh',1),
 (4,'Dương Văn Quan','19810708',1,'543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng',1),
 (5,'Hoàng Trần Nhi Nhi','19951209',0,'795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai',4),
 (6,'Tôn Nữ Mộc Châu','20051206',0,'732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng',4),
 (7,'Nguyễn Mỹ Kim','19840408',0,'856453123','0912345698','kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh',1),
 (8,'Nguyễn Thị Hào','19990408',0,'965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum',3),
 (9,'Trần Đại Danh','19940701',1,'432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi',1),
 (10,'Nguyễn Tâm Đắc','19890701',1,344343432,0987654321,'dactam@gmail.com','22 Ngô Quyền, Đà Nẵng',2);
 insert into kieu_thue(ma_kieu_thue,ten_kieu_thue) values (1,'year'),(2, 'month'),(3,'day'),(4,'house');
 insert into loai_dich_vu(ma_loai_dich_vu,ten_loai_dich_vu) values (1,'Villa'),(2,'House'),(3,'Room');
 insert into  dich_vu(ma_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,tieu_chuan_phong,mo_ta_tien_nghi_khac,
 dien_tich_ho_boi,so_tang,ma_kieu_thue,ma_loai_dich_vu)values
 (1,'Villa Beach Front',25000,10000000,10,'vip','có hồ bơi',500,4,3,1),
 (2,'House Princess 01',14000,5000000,7,'vip','có thêm bếp nướng',null,4,2,2),
 (3,'Room Twin 01',5000,1000000,2,'normal','có tivi',null,null,4,3),
 (4,'Villa No Beach Front',22000,9000000,8,'normal','có hồ bơi',300,4,3,1),
 (5,'House Princess 02',10000,4000000,5,'normal','có thêm bếp nướng',null,4,3,2),
 (6,'Room Twin 02',3000,900000,2,'normal','có tivi',null,null,4,3);
 
 insert into dich_vu_di_kem(ma_dich_vu_di_kem,ten_dich_vu_di_kem,gia,don_vi,trang_thai) values 
 (1,'karaoke',10000,'giờ','tiện nghi, hiện đại'),
 (2,'thuê xe máy',10000,'chiếc','hỏng một xe'),
(3,'thuê xe đạp',20000,'chiếc','tốt'),
(4,'buffet buổi sáng',15000,'suất','đầy đủ đồ ăn tráng miệng'),
(5,'buffet buổi trưa',90000,'suất','đầy đủ đồ ăn tráng miệng'),
(6,'buffet buổi tối',16000,'suất','đầy đủ đồ ăn tráng miệng');
      
insert into hop_dong(ma_hop_dong,ngay_lam_hop_dong,ngay_ket_thuc,
tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) values 
(1,'20201208','20201208',0,3,1,3),
(2,'20200714','20200721',200000,7,3,1),
(3,'20210315','20210317',50000,3,4,2),
(4,'20210114','20210118',100000,7,5,5),
(5,'20210714','20210715',0,7,2,6),
(6,'20210601','20210603',0,7,7,6),
(7,'20210902','20210905',100000,7,4,4),
(8,'20210617','20210618',150000,3,4,1),
(9,'20201119','20201119',0,3,4,3),
(10,'20210412','20210414',0,10,3,5),
(11,'20210425','20210425',0,2,2,1),
(12,'20210525','20210527',0,7,10,1);
insert into hop_dong_chi_tiet(ma_hop_dong_chi_tiet,so_luong,ma_hop_dong,ma_dich_vu_di_kem)values
(1,5,2,4),(2,8,2,5),(3,15,2,6),(4,1,3,1),(5,11,3,2),(6,1,1,3),(7,2,1,2),(8,2,12,2);




 
--         tack2	        Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên
--                         bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.

select *from nhan_vien
where ho_va_ten like'H%' or ho_va_ten like 'T%'OR ho_va_ten like 'K%' and  length(ho_va_ten)<15;

--          tack3    	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa 
--                      chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang
-- where ngay_sinh between '1972-05-15' and '2004-05-15'
where year(current_date())-year(ngay_sinh)>18 and  year(current_date())-year(ngay_sinh)<50
and (dia_chi like '%Đà Nẵng' or dia_chi like '%Quảng Trị');


--         tack4 	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả
--                  hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
 --                 Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
 use furama_resort;
select khach_hang.ma_khach_hang,khach_hang.ho_ten, count(hop_dong.ma_khach_hang) as so_lan_dat_phong 
from khach_hang
inner join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
where ma_loai_khach=(select ma_loai_khach from loai_khach where ten_loai_khach='Diamond')
group by khach_hang.ma_khach_hang
order by so_lan_dat_phong;


--           tack5 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong,
 --                    ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
 --                    (Với tổng tiền được tính theo công thức như sau:
--                     Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet)
--                     cho tất cả các khách hàng đã từng đặt phòng. 
 --                     (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
 SET SQL_MODE = '';
 select khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, dich_vu.ten_dich_vu, hop_dong.ma_hop_dong,
 hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,   (dich_vu.chi_phi_thue+ (hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia)) as tong_tien
 from khach_hang
 left join loai_khach on khach_hang.ma_loai_khach= loai_khach.ma_loai_khach
 left join hop_dong on khach_hang.ma_khach_hang= hop_dong.ma_khach_hang
 left join dich_vu on hop_dong.ma_dich_vu= dich_vu.ma_dich_vu 
 left join hop_dong_chi_tiet on hop_dong.ma_hop_dong= hop_dong_chi_tiet.ma_hop_dong
 left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem= dich_vu_di_kem.ma_dich_vu_di_kem
 group by hop_dong.ma_hop_dong;
 
 
 -- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, 
 -- ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng 
 -- thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
 
 
  select dich_vu.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich,
 dich_vu.chi_phi_thue,loai_dich_vu.ten_loai_dich_vu 
 from dich_vu
 
 
