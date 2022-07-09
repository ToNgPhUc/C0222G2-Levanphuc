use caseStudy_module4;
 insert into rent_type(id,name_rent_type)
value (1,'year'),(2,'month'),(3,'day'),(4,'hour');

insert into facility_type(id,name_facility_type)
value (1,'Villa'),(2,'House'),(3,'Room');

insert into customer_type(id,name_customer_type)
value (1,'Diamond'),(2,'Platinium'),(3,'Gold'),(4,'Silver'),(5,'Member');

insert into `position`(id,name_position)
value (1,'Quản Lí'),(2,'Nhân Viên');

insert into education_degree(id,name_education_degree)
value (1,'Trung Cấp'),(2,'Cao Đẳng'),(3,'Đại Học'),(4,'Sau Đại Học');

insert into division(id,name_division)
value (1,'Sale-Marketing'),(2,'Hành Chính'),(3,'Phục vụ'),(4,'Quản lý');



insert into user ( username, `password`) values ( 'dbuser1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu'),
 ( 'dbadmin1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu');
insert into `role` (id, role_name) values (1, 'ROLEuser_ADMIN'),(2, 'ROLE_USER');

insert into user_role (id, `role`, username) values (1, 1, 'dbuser1'),(2, 1,'dbadmin1' ),(3, 2, 'dbadmin1');
    
insert into employee(id,name_employee,date_of_day,id_card,salary,phone_number,email,address,id_position,education_degree,divition,username)
value 
(1,'Nguyễn Văn An','1970-11-07','456231786',10000000,0901234121,'annguyen@gmail.com','295 Nguyễn Tất Thành,Đà Nẵng',1,3,1,'dbuser1'),
(2,'Lê Văn Bình','1997-04-09','654231234',7000000,0934212314,'binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2,'dbuser1'),
(3,'Hồ Thị Yến','1995-12-12','999231723',14000000,0412352315,'thiyen@gmail.com','K234/11 Điện Biên Phủ,Gia Lai',1,3,2,'dbuser1'),
(4,'Võ Công Toản','1980-04-04','123231365',17000000,0374443232,'toan0404@gmail.com','77 Hoàng Diệu,Quảng Trị',1,4,4,'dbadmin1'),
(5,'Nguyễn Bỉnh Phát','1999-12-09','454363232',6000000,0902341231,'phatphat@gmail.com','43 Yên Bái,Đà Nẵng',2,1,1,'dbadmin1'),
(6,'Khúc Nguyễn An Nghi','2000-11-08','964542311',7000000,0978653213,'annghi20@gmail.com','294 Nguyễn Tất Thành,Đà Nẵng',2,2,3,'dbadmin1'),
(7,'Nguyễn Hữu Hà','1993-01-01','534323231',8000000,0941234553,'nhh0101@gmail.com','4 Nguyễn Chí Thanh,Huế',2,3,2,'dbadmin1');

insert into customer(id,customer_type,name_customer,date_of_birth,gender,id_card,phone_number,email,address)
value (1,5,'Nguyễn Thị Hào','1970-11-07',0,'643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng,Đà Nẵng'),	
	(2,3,'Phạm Xuân Diệu','1992-08-08',1,'865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên,Quảng Trị'),
	(3,1,'Trương Đình Nghệ','1990-02-27',1,'488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh'),
	(4,1,'Dương Văn Quan','1981-07-08',1,'543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng'),
	(5,4,'Hoàng Trần Nhi Nhi','1995-12-09',0,'795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ,Gia Lai'),
	(6,4,'Tôn Nữ Mộc Châu','2005-12-06',0,'732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế,Đà Nẵng'),
	(7,1,'Nguyễn Mỹ Kim','1984-04-08',0,'856453123','0912345698','kimcuong84@gmail.com','K123/45 Lê Lợi,Hồ Chí Minh'),
	(8,3,'Nguyễn Thị Hào','1999-04-08',0,'965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh,Kon Tum'),
	(9,1,'Trần Đại Danh','1994-07-01',1,'432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt Quảng Ngãi'),
	(10,2,'Nguyễn Tâm Đắc','1989-07-01',1,'344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng');

insert into facility(id,name_facility,area_facility,cost_facility,max_people,standard_room,description_other_convenience,pool_area,number_of_floors,rent_type,facility_type)
value (	1,'Villa Beach Front',25000,10000000,10,'vip','Có hồ bơi',500,4,3,1),
	(2,'House Princess 01',	14000,5000000,7,'vip','Có thêm bếp nướng',null,3,2,2),
	(3,'Room Twin 01',5000,1000000,2,'normal','Có tivi',null,null,4,3),
	(4,'Villa No Beach Front',22000,9000000,8,'normal','Có hồ bơi',300,3,3,1),
	(5,'House Princess 02',10000,4000000,5,'normal','Có thêm bếp nướng',null,2,3,2),
	(6,'Room Twin 02',3000,900000,2,'normal','Có tivi',null,null,4,3);
    
INSERT INTO `caseStudy_module4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer`, `employee`, `facility`) VALUES ('1', '100', '14-02-1995', '14-01-1995', '1', '1', '1');
INSERT INTO `caseStudy_module4`.`contract` (`id`, `deposit`, `end_date`, `start_date`, `customer`, `employee`, `facility`) VALUES ('2', '100', '14-02-1995', '14-02-2994', '2', '2', '2');

INSERT INTO `caseStudy_module4`.`attach_facility` (`id`, `code`, `name_attach`, `status`, `unit`) VALUES ('1', '100', 'karaoke', 'hiện đại', 'giờ');
INSERT INTO `caseStudy_module4`.`attach_facility` (`id`, `code`, `name_attach`, `status`, `unit`) VALUES ('2', '10', 'thuê xe máy', 'xe mới', 'chiếc');

INSERT INTO `caseStudy_module4`.`contract_detail` (`id`, `quantity`, `attach_facility`, `contract`) VALUES ('1', '100', '1', '1');
INSERT INTO `caseStudy_module4`.`contract_detail` (`id`, `quantity`, `attach_facility`, `contract`) VALUES ('2', '100', '2', '2');

