drop database if exists quan_li_ban_hang;
create database if not exists quan_li_ban_hang;

use quan_li_ban_hang;

create table customer (
c_id int primary key,
c_name varchar (100),
c_age int 
);

create table order1(
o_id int primary key,
c_id int ,
foreign key (c_id) references customer(c_id),
o_date Datetime,
o_total_price double

); create table product(
p_id int primary key,
p_name varchar (100),
p_price double);

create table order_detail(
o_id int  ,
p_id int,
primary key (o_id,p_id),
od_qty varchar (100),
foreign key (o_id) references order1 (o_id),
foreign key (p_id) references product(p_id)
);
