drop database if exists furama_resort;
create database furama_resort;

use furama_resort;

create table vi_tri(
	ma_vi_tri int primary key,
    ten_vi_tri varchar(45),
    `status` bit default 0
    
);


create table trinh_do(
	ma_trinh_do int,
    ten_trinh_do varchar(45),
	`status` bit default 0,
    primary key(ma_trinh_do)
 
);

create table bo_phan(
	ma_bo_phan int,
    ten_bo_phan varchar(45),
     `status` bit default 0,
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
    `status` bit default 0,
    foreign key(ma_vi_tri) references vi_tri(ma_vi_tri),
    foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
    foreign key(ma_bo_phan) references bo_phan(ma_bo_phan),
    primary key(ma_nhan_vien) 
    
);

create table loai_khach(
	ma_loai_khach int,
    ten_loai_khach varchar(45),
       `status` bit default 0,
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
      `status` bit default 0,
    primary key(ma_khach_hang)
);

create table loai_dich_vu(
	ma_loai_dich_vu int,
    ten_loai_dich_vu varchar(45),
     `status` bit default 0,
    primary key(ma_loai_dich_vu)
      
);

create table kieu_thue(
	ma_kieu_thue int,
    ten_kieu_thue varchar(45),
      `status` bit default 0,
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
    `status` bit default 0,
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
    `status` bit default 0,
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
    primary key(ma_dich_vu_di_kem),
       `status` bit default 0
);

create table hop_dong_chi_tiet(
	ma_hop_dong_chi_tiet int,
    ma_hop_dong int,
    ma_dich_vu_di_kem int,
    foreign key(ma_hop_dong) references hop_dong(ma_hop_dong),
    foreign key(ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem),
    so_luong int,
    primary key(ma_hop_dong_chi_tiet),
       `status` bit default 0
);
insert into vi_tri(ma_vi_tri,ten_vi_tri) values (1,'quan L??'),(2,'nh??n vi??n');
insert into trinh_do (ma_trinh_do,ten_trinh_do) values (1,'trung c???p'),(2,'cao ?????ng'),(3, '?????i h???c'),(4, ' sau ?????i h???c');
insert into bo_phan(ma_bo_phan,ten_bo_phan) values (1,'Sale-Marketing'),(2,'H??nh ch??nh'),(3,'ph???c v???'),(4,'Quan L??');
insert into nhan_vien(ma_nhan_vien,ho_va_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan) values 
 (1,'Nguy???n V??n An','19701107',456231786,10000000,0901234121,'annguyen@gmail.com','295 nguy???n t???t th??nh ,???? d???ng',1,3,1),
(2,'L?? v??n B??nh','19970409',654231234,7000000,0934212314,'binhlv@gmail.com','22 y??n b??i ???? n???ng',1,2,2),
(3,'H??? Th??? Y???n','19951212',999231723,14000000,0412352315,'thiyen@gmail.com','K234/11 ??i???n Bi??n Ph???, Gia Lai',1,3,2),
 (4,'V?? C??ng To???n','19800404',123231365,17000000,0374443232,'toan0404gmail.com','77 Ho??ng Di???u, Qu???ng Tr???',1,4,4),
 (5,'Nguy???n B???nh Ph??t','19991209',454363232,6000000,0902341231,'phatphatgmail.com','43 y??n b??i ???? n???ng',2,1,1),
 (6,'Kh??c Nguy???n An Nghi','20001108',964542311,7000000,0978653213,'annghi20@gmail.com','294 nguy???n t???t th??nh, ???? n???ng',2,2,3),
 (7,'Nguy???n H???u H??','19930101',534323231,8000000,0941234553,'nhh0101@gmail.com','4 nguy???n ch?? thanh,Hu???',2,3,2),
 (8,'Nguy???n H?? ????ng','19890903',234414123,9000000,0642123111,'donghanguyen@gmail.com','111 H??ng V????ng, H?? N???i',2,4,4),
 (9,'T??ng Hoang','19820903',256781231,6000000,0245144444,'hoangtong@gmail.com','213 H??m Nghi, ???? N???ng',2,4,4),
 (10,'Nguy???n C??ng ?????o','19940108',755434343,8000000,0988767111,'nguyencongdao12@gmail.com','H??a Kh??nh, ?????ng Nai',2,3,2);
 insert into loai_khach(ma_loai_khach,ten_loai_khach)values(1,'Diamond'),(2,'platinium'),(3,'gold'),(4,'silver'),(5,'member');
 insert into khach_hang(ma_khach_hang,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi,ma_loai_khach) values
 (1,'Nguy???n Th??? H??o','19701107',0,'643431213','0945423362','thihao07@gmail.com','23 Nguy???n ho??ng, ???? N???ng',5),
 (2,'Ph???m Xu??n Di???u','19920808',1,'865342123','0954333333','xuandieu92@gmail.com','K77/22 Th??i Phi??n, Qu???ng Tr???',3),
 (3,'Tr????ng ????nh Ngh???','19900227',1,'488645199','0373213122','nghenhan2702@gmail.com','K323/12 ??ng ??ch Khi??m, Vinh',1),
 (4,'D????ng V??n Quan','19810708',1,'543432111','0490039241','duongquan@gmail.com','K453/12 L?? L???i, ???? N???ng',1),
 (5,'Ho??ng Tr???n Nhi Nhi','19951209',0,'795453345','0312345678','nhinhi123@gmail.com','224 L?? Th??i T???, Gia Lai',4),
 (6,'T??n N??? M???c Ch??u','20051206',0,'732434215','0988888844','tonnuchau@gmail.com','37 Y??n Th???, ???? N???ng',4),
 (7,'Nguy???n M??? Kim','19840408',0,'856453123','0912345698','kimcuong84@gmail.com','K123/45 L?? L???i, H??? Ch?? Minh',1),
 (8,'Nguy???n Th??? H??o','19990408',0,'965656433','0763212345','haohao99@gmail.com','55 Nguy???n V??n Linh, Kon Tum',3),
 (9,'Tr???n ?????i Danh','19940701',1,'432341235','0643343433','danhhai99@gmail.com','24 L?? Th?????ng Ki???t, Qu???ng Ng??i',1),
 (10,'Nguy???n T??m ?????c','19890701',1,344343432,0987654321,'dactam@gmail.com','22 Ng?? Quy???n, ???? N???ng',2);
 insert into kieu_thue(ma_kieu_thue,ten_kieu_thue) values (1,'year'),(2, 'month'),(3,'day'),(4,'house');
 insert into loai_dich_vu(ma_loai_dich_vu,ten_loai_dich_vu) values (1,'Villa'),(2,'House'),(3,'Room');
 insert into  dich_vu(ma_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,tieu_chuan_phong,mo_ta_tien_nghi_khac,
 dien_tich_ho_boi,so_tang,ma_kieu_thue,ma_loai_dich_vu)values
 (1,'Villa Beach Front',25000,10000000,10,'vip','c?? h??? b??i',500,4,3,1),
 (2,'House Princess 01',14000,5000000,7,'vip','c?? th??m b???p n?????ng',null,4,2,2),
 (3,'Room Twin 01',5000,1000000,2,'normal','c?? tivi',null,null,4,3),
 (4,'Villa No Beach Front',22000,9000000,8,'normal','c?? h??? b??i',300,4,3,1),
 (5,'House Princess 02',10000,4000000,5,'normal','c?? th??m b???p n?????ng',null,4,3,2),
 (6,'Room Twin 02',3000,900000,2,'normal','c?? tivi',null,null,4,3);
 
 insert into dich_vu_di_kem(ma_dich_vu_di_kem,ten_dich_vu_di_kem,gia,don_vi,trang_thai) values 
 (1,'karaoke',10000,'gi???','ti???n nghi, hi???n ?????i'),
 (2,'thu?? xe m??y',10000,'chi???c','h???ng m???t xe'),
(3,'thu?? xe ?????p',20000,'chi???c','t???t'),
(4,'buffet bu???i s??ng',15000,'su???t','?????y ????? ????? ??n tr??ng mi???ng'),
(5,'buffet bu???i tr??a',90000,'su???t','?????y ????? ????? ??n tr??ng mi???ng'),
(6,'buffet bu???i t???i',16000,'su???t','?????y ????? ????? ??n tr??ng mi???ng');
      
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


 
--         tack2	        Hi???n th??? th??ng tin c???a t???t c??? nh??n vi??n c?? trong h??? th???ng c?? t??n
--                         b???t ?????u l?? m???t trong c??c k?? t??? ???H???, ???T??? ho???c ???K??? v?? c?? t???i ??a 15 k?? t???.

select *from nhan_vien
where ho_va_ten like'H%' or ho_va_ten like 'T%'OR ho_va_ten like 'K%' and  length(ho_va_ten)<15;

--          tack3    	Hi???n th??? th??ng tin c???a t???t c??? kh??ch h??ng c?? ????? tu???i t??? 18 ?????n 50 tu???i v?? c?? ?????a 
--                      ch??? ??? ??????? N???ng??? ho???c ???Qu???ng Tr??????.
select * from khach_hang
where year(current_date())-year(ngay_sinh)>18 and  year(current_date())-year(ngay_sinh)<50
and (dia_chi like '%???? N???ng' or dia_chi like '%Qu???ng Tr???');


--         tack4 	?????m xem t????ng ???ng v???i m???i kh??ch h??ng ???? t???ng ?????t ph??ng bao nhi??u l???n. K???t qu???
--                  hi???n th??? ???????c s???p x???p t??ng d???n theo s??? l???n ?????t ph??ng c???a kh??ch h??ng.
 --                 Ch??? ?????m nh???ng kh??ch h??ng n??o c?? T??n lo???i kh??ch h??ng l?? ???Diamond???.
 use furama_resort;
select khach_hang.ma_khach_hang,khach_hang.ho_ten, count(hop_dong.ma_khach_hang) as so_lan_dat_phong 
from khach_hang
inner join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
where ma_loai_khach=(select ma_loai_khach from loai_khach where ten_loai_khach='Diamond')
group by khach_hang.ma_khach_hang
order by so_lan_dat_phong;


--           tack5 5.	Hi???n th??? ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong,
 --                    ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
 --                    (V???i t???ng ti???n ???????c t??nh theo c??ng th???c nh?? sau:
--                     Chi Ph?? Thu?? + S??? L?????ng * Gi??, v???i S??? L?????ng v?? Gi?? l?? t??? b???ng dich_vu_di_kem, hop_dong_chi_tiet)
--                     cho t???t c??? c??c kh??ch h??ng ???? t???ng ?????t ph??ng. 
 --                     (nh???ng kh??ch h??ng n??o ch??a t???ng ?????t ph??ng c??ng ph???i hi???n th??? ra).
 SET SQL_MODE = '';
 select khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, dich_vu.ten_dich_vu, hop_dong.ma_hop_dong,
 hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,    sum(ifnull (dich_vu.chi_phi_thue,0)+ ifnull (hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia, 0)) as tong_tien
 from khach_hang
 left join loai_khach on khach_hang.ma_loai_khach= loai_khach.ma_loai_khach
 left join hop_dong on khach_hang.ma_khach_hang= hop_dong.ma_khach_hang
 left join dich_vu on hop_dong.ma_dich_vu= dich_vu.ma_dich_vu 
 left join hop_dong_chi_tiet on hop_dong.ma_hop_dong= hop_dong_chi_tiet.ma_hop_dong
 left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem= dich_vu_di_kem.ma_dich_vu_di_kem
 group by hop_dong.ma_hop_dong;
 
 
 -- 6.	Hi???n th??? ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, 
 -- ten_loai_dich_vu c???a t???t c??? c??c lo???i d???ch v??? ch??a t???ng ???????c kh??ch h??ng 
 -- th???c hi???n ?????t t??? qu?? 1 c???a n??m 2021 (Qu?? 1 l?? th??ng 1, 2, 3).
 

  select dich_vu.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich,
 dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
 from dich_vu
 join loai_dich_vu on dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
 join hop_dong on dich_vu.ma_dich_vu= hop_dong.ma_dich_vu
 where dich_vu.ma_dich_vu 
 not in (select dich_vu.ma_dich_vu from dich_vu 
 join loai_dich_vu on dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
 join hop_dong on dich_vu.ma_dich_vu= hop_dong.ma_dich_vu
 where year (hop_dong.ngay_lam_hop_dong)=2021 
 and (month (hop_dong.ngay_lam_hop_dong)=1 or month (hop_dong.ngay_lam_hop_dong)=2 or month (hop_dong.ngay_lam_hop_dong)=3))
 group by dich_vu.ma_dich_vu;
 
 -- taks7.	Hi???n th??? th??ng tin ma_dich_vu, ten_dich_vu, dien_tich, 
 -- so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu c???a t???t c??? c??c lo???i 
 --  d???ch v??? ???? t???ng ???????c kh??ch h??ng ?????t ph??ng trong n??m 2020 nh??ng ch??a t???ng ???????c kh??ch h??ng ?????t ph??ng trong n??m 2021.
 select dich_vu.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, 
 dich_vu.so_nguoi_toi_da, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu 
 from dich_vu
 join loai_dich_vu on dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
 join hop_dong on dich_vu.ma_dich_vu= hop_dong.ma_dich_vu
  where year(hop_dong.ngay_lam_hop_dong) = 2020 and hop_dong.ma_dich_vu
not  in (select hop_dong.ma_dich_vu from hop_dong
 where year(hop_dong.ngay_lam_hop_dong) = 2021)
 group by dich_vu.ma_dich_vu;
 
 
 -- 8.	Hi???n th??? th??ng tin ho_ten kh??ch h??ng c?? trong h??? th???ng, v???i y??u c???u ho_ten kh??ng tr??ng nhau
 select ho_ten from khach_hang
 union 
 select ho_ten from khach_hang;
 
 SELECT DISTINCT ho_ten from khach_hang;

select ho_ten from khach_hang
group by ho_ten;

               -- 9.	 Th???c hi???n th???ng k?? doanh thu theo th??ng, ngh??a l?? t????ng ???ng v???i m???i th??ng trong n??m 2021
                --  th?? s??? c?? bao nhi??u kh??ch h??ng th???c hi???n ?????t ph??ng.
                
select month(ngay_lam_hop_dong) as thang , count(ma_khach_hang) as so_lan_dat_phong from hop_dong
where year(ngay_lam_hop_dong)=2021
group by thang
order by thang;


-- tack 10 10.	Hi???n th??? th??ng tin t????ng ???ng v???i t???ng h???p ?????ng th?? ???? s??? d???ng
 -- bao nhi??u d???ch v??? ??i k??m. K???t qu??? hi???n th??? bao g???m ma_hop_dong, ngay_lam_hop_dong, 
 -- ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (???????c t??nh d???a tr??n vi???c sum so_luong ??? dich_vu_di_kem).
			
select hop_dong.ma_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc, hop_dong.tien_dat_coc,
 ifnull(sum(hop_dong_chi_tiet.so_luong),0) as so_luong_dich_vu_di_kem
from hop_dong
left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
group by hop_dong.ma_hop_dong;

          -- tack 11.  	Hi???n th??? th??ng tin c??c d???ch v??? ??i k??m ???? ???????c s??? d???ng b???i nh???ng kh??ch h??ng c?? ten_loai_khach l?? 
         -- ???Diamond??? v?? c?? dia_chi ??? ???Vinh??? ho???c ???Qu???ng Ng??i???.


select dich_vu_di_kem.* from dich_vu_di_kem
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem= hop_dong_chi_tiet.ma_dich_vu_di_kem
join hop_dong on hop_dong_chi_tiet.ma_hop_dong= hop_dong.ma_hop_dong
join khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
join loai_khach on khach_hang.ma_loai_khach= loai_khach.ma_loai_khach
where loai_khach.ten_loai_khach = 'Diamond' and (khach_hang.dia_chi like "%vinh" or khach_hang.dia_chi like "%qu???ng Ng??i");


-- task. 12.	Hi???n th??? th??ng tin ma_hop_dong, ho_ten (nh??n vi??n), ho_ten (kh??ch h??ng), so_dien_thoai (kh??ch h??ng),
 -- ten_dich_vu, so_luong_dich_vu_di_kem (???????c t??nh d???a tr??n vi???c sum so_luong ??? dich_vu_di_kem), 
 -- tien_dat_coc c???a t???t c??? c??c d???ch v??? ???? t???ng ???????c kh??ch h??ng ?????t v??o 3 th??ng cu???i n??m 2020 
 -- nh??ng ch??a t???ng ???????c kh??ch h??ng ?????t v??o 6 th??ng ?????u n??m 2021.
 
select  hop_dong.ma_hop_dong, nhan_vien.ho_va_ten, khach_hang.ho_ten, khach_hang.so_dien_thoai, dich_vu.ma_dich_vu ,
 dich_vu.ten_dich_vu,  hop_dong.tien_dat_coc, sum(hop_dong_chi_tiet.so_luong)
from dich_vu
join hop_dong on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
left join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hop_dong= hop_dong.ma_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem= dich_vu_di_kem.ma_dich_vu_di_kem
left join nhan_vien on hop_dong.ma_nhan_vien= nhan_vien.ma_nhan_vien
left join khach_hang on hop_dong.ma_khach_hang= khach_hang.ma_khach_hang
where year(hop_dong.ngay_lam_hop_dong)= 2020 and
 (month(hop_dong.ngay_lam_hop_dong)>=10) and 
 hop_dong.ma_hop_dong not in
 (select hop_dong.ngay_lam_hop_dong from hop_dong
 where year(hop_dong.ngay_lam_hop_dong)= 2021 and
 (month(hop_dong.ngay_lam_hop_dong)<=6))
 group by hop_dong.ma_hop_dong;
 
 
-- tack 13	Hi???n th??? th??ng tin c??c D???ch v??? ??i k??m ???????c s??? d???ng nhi???u nh???t b???i c??c Kh??ch h??ng ???? ?????t ph??ng.
 -- (L??u ?? l?? c?? th??? c?? nhi???u d???ch v??? c?? s??? l???n s??? d???ng nhi???u nh?? nhau).
 
 select dich_vu_di_kem.ten_dich_vu_di_kem,dich_vu_di_kem.ma_dich_vu_di_kem,
 sum(hop_dong_chi_tiet.so_luong) as so_lan_su_dung_nhieu_nhat from hop_dong_chi_tiet
join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem= dich_vu_di_kem.ma_dich_vu_di_kem
 group by dich_vu_di_kem.ma_dich_vu_di_kem
having so_lan_su_dung_nhieu_nhat = (select max(hop_dong_chi_tiet.so_luong) from hop_dong_chi_tiet);
 


 -- tack14.	Hi???n th??? th??ng tin t???t c??? c??c D???ch v??? ??i k??m ch??? m???i ???????c s??? d???ng m???t l???n duy nh???t. 
 -- Th??ng tin hi???n th??? bao g???m ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung 
 -- (???????c t??nh d???a tr??n vi???c count c??c ma_dich_vu_di_kem).



select hop_dong.ma_hop_dong, loai_dich_vu.ten_loai_dich_vu, dich_vu_di_kem.ten_dich_vu_di_kem,
count(dich_vu_di_kem.ma_dich_vu_di_kem) as so_lan_su_dung
from dich_vu_di_kem
join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
join hop_dong on hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
join loai_dich_vu on dich_vu.ma_loai_dich_vu= loai_dich_vu.ma_loai_dich_vu
group by dich_vu_di_kem.ten_dich_vu_di_kem
having so_lan_su_dung=1
order by ma_hop_dong;
 
 
 
          -- tack 15.	Hi???n thi th??ng tin c???a t???t c??? nh??n vi??n bao g???m ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan,
          -- so_dien_thoai, dia_chi m???i ch??? l???p ???????c t???i ??a 3 h???p ?????ng t??? n??m 2020 ?????n 2021.
 
 select nhan_vien.ma_nhan_vien, nhan_vien.ho_va_ten, trinh_do.ten_trinh_do, bo_phan.ten_bo_phan,
        nhan_vien.so_dien_thoai, nhan_vien.dia_chi
 from nhan_vien
 join trinh_do on nhan_vien.ma_trinh_do = trinh_do.ma_trinh_do
 join bo_phan on nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan
 join hop_dong on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
 where hop_dong.ngay_lam_hop_dong between '2019-12-31' and '2021-12-31'
 group by nhan_vien.ma_nhan_vien
having count(hop_dong.ma_hop_dong)<=3;

           -- tack 16.	X??a nh???ng Nh??n vi??n ch??a t???ng l???p ???????c h???p ?????ng n??o t??? n??m 2019 ?????n n??m 2021.
set sql_safe_updates= 0;
update nhan_vien 
set `status`=1
where nhan_vien.ma_nhan_vien 
not in  (select hop_dong.ma_nhan_vien from hop_dong 
where (hop_dong.ngay_lam_hop_dong between '2019-01-01' and '2021-12-31')
group by nhan_vien.ma_nhan_vien);
set sql_safe_updates= 1;


 -- tack  17.	C???p nh???t th??ng tin nh???ng kh??ch h??ng c?? ten_loai_khach t??? Platinum l??n Diamond,
--  ch??? c???p nh???t nh???ng kh??ch h??ng ???? t???ng ?????t ph??ng v???i T???ng Ti???n thanh to??n 
--  trong n??m 2021 l?? l???n h??n 10.000.000 VN??.

select khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ma_loai_khach from khach_hang
join loai_khach on khach_hang.ma_loai_khach= loai_khach.ma_loai_khach
join hop_dong on khach_hang.ma_khach_hang= hop_dong.ma_khach_hang
join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
join hop_dong_chi_tiet on hop_dong.ma_hop_dong= hop_dong_chi_tiet.ma_hop_dong
join dich_vu_di_kem on hop_dong_chi_tiet.ma_dich_vu_di_kem= dich_vu_di_kem.ma_dich_vu_di_kem
where year(hop_dong.ngay_lam_hop_dong) = 2021 and loai_khach.ten_loai_khach ="Platinium"
group by  khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ma_loai_khach
having  sum(dich_vu.chi_phi_thue + (hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia)) > 10000000;

             -- tack 18.	X??a nh???ng kh??ch h??ng c?? h???p ?????ng tr?????c n??m 2021 (ch?? ?? r??ng bu???c gi???a c??c b???ng).

set sql_safe_updates= 0;
update khach_hang 
set `status`=1
where khach_hang.ma_khach_hang in ( select hop_dong.ma_khach_hang from hop_dong
where year(hop_dong.ngay_lam_hop_dong)<2021);
set sql_safe_updates= 1;

 
          -- tack19.	C???p nh???t gi?? cho c??c d???ch v??? ??i k??m ???????c s??? d???ng tr??n 10 l???n trong n??m 2020 l??n g???p ????i.
 
 
--  select hop_dong_chi_tiet.ma_dich_vu_di_kem from dich_vu_di_kem
--  join hop_dong_chi_tiet on dich_vu_di_kem.ma_dich_vu_di_kem= hop_dong_chi_tiet.ma_dich_vu_di_kem
-- join hop_dong on hop_dong_chi_tiet.ma_hop_dong= hop_dong.ma_hop_dong
-- where year(hop_dong.ngay_lam_hop_dong) = 2020
-- having sum(dich_vu_di_kem.ma_dich_vu_di_kem)>10 ;
 
 set sql_safe_updates= 0;
update dich_vu_di_kem 
set gia = gia*2
where  dich_vu_di_kem.ma_dich_vu_di_kem in (select hop_dong_chi_tiet.ma_dich_vu_di_kem from hop_dong_chi_tiet
join hop_dong on hop_dong_chi_tiet.ma_hop_dong= hop_dong.ma_hop_dong
where year(hop_dong.ngay_lam_hop_dong) = 2020
having sum(dich_vu_di_kem.ma_dich_vu_di_kem)>10 );
set sql_safe_updates= 1;

         --    task 20.	Hi???n th??? th??ng tin c???a t???t c??? c??c nh??n vi??n v?? kh??ch h??ng c?? trong h??? th???ng, th??ng tin hi???n th??? bao g???m 
          -- id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.

select nhan_vien.ma_nhan_vien as 'id', nhan_vien.ho_va_ten, 'nhan_vien'as 'role',nhan_vien.email,nhan_vien.so_dien_thoai,nhan_vien.ngay_sinh,nhan_vien.dia_chi from nhan_vien
union
select khach_hang.ma_khach_hang as 'id', khach_hang.ho_ten,'khach_hang'as 'role',khach_hang.email,khach_hang.so_dien_thoai,khach_hang.ngay_sinh,khach_hang.dia_chi from khach_hang;



