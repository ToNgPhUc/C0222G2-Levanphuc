create database person;
use person;
create table customer1(
id int primary key,
ten varchar (255),
tuoi int ,
email varchar(255));

insert into customer1 (id,ten,tuoi,email) value (1,'phuc',10,'tongphuc'),(2,'phuc1',15,'tongphuc1'),(3,'phuc2',10,'tongphuc2'),(4,'phuc1',15,'tongphuc');

-- xoa toan bo du lieu cua bang customer1. 
truncate table customer1;

-- xoa toan bo du lieu cua bang customer1 giong voiw lenh truncate 
set sql_safe_updates=0;
delete from customer1 ;
set sql_safe_updates=1;


-- xoa du lieu cua dong cos ten la phuc1:
set sql_safe_updates=0;
delete from customer1 
where ten='phuc1';
set sql_safe_updates=1;

-- tinh tong tuoi nhom theo ten
select ten,avg(tuoi)  as tong_tuoi from customer1
group by ten;

-- cong them 100 tuoi vao trong du lieu cot chuoi
SELECT tuoi +  100  FROM customer1;


-- noi chuoi, them chuoi vao cac cot ten, tuoi va email
select concat('ten la ',ten,'  tuoi la ' ,tuoi, '  email la ',email) as 'gioi thieu' from customer1;

