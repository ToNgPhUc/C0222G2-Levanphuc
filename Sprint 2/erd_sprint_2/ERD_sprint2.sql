drop database if exists shop_online;
create database shop_online;
use shop_online;

CREATE TABLE `app_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_deleted` bit(1) DEFAULT b'0',
  `role_name` varchar(255) NOT NULL UNIQUE,
  PRIMARY KEY (`id`)
);
CREATE TABLE `app_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_deleted` bit(1) DEFAULT b'0',
  `password` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL ,
  PRIMARY KEY (`id`)
);
CREATE TABLE `user_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_deleted` bit(1) DEFAULT b'0',
  `role_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`user_id`) REFERENCES `app_user` (`id`),
  FOREIGN KEY (`role_id`) REFERENCES `app_role` (`id`)
);
CREATE TABLE `customer`(
`id` int NOT null auto_increment,
`name` VARCHAR (255),
`email` varchar(255),
`address` varchar(255),
`phone_number` varchar(255),
`user_id` int ,
primary key (`id`),
foreign key (`user_id`) references `app_user` (`id`)
);

Create table type_product(
`id` int not null auto_increment,
`code` varchar(255),
`name` varchar (255),
primary key (`id`)
);
CREATE TABLE product(
`id` int not null auto_increment,
`code` varchar(255) NOT NULL UNIQUE,
`name` varchar(255),
`price` double,
`image` varchar(255),
`is_deleted` bit(1) DEFAULT b'0',
`id_type_product`int,
primary key (`id`),
foreign key (`id_type_product`) references `type_product`(`id`)
);
create table bill(
`id` int not null auto_increment, 
`code` varchar(255),
`creation_date` date,
primary key (`id`)
);

Create table `order`(
`id` int not null auto_increment,
`quantyti`int,
`code` varchar(255),
`id_customer` int,
`id_product` int,
`id_bill` int,
primary key (`id`),
foreign key (`id_customer`) references `customer`(`id`),
foreign key (`id_product`) references `product`(`id`),
foreign key (`id_bill`) references `bill`(`id`)
);
