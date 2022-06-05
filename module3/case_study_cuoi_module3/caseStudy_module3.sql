drop database if exists furama_resorts;
create database furama_resorts;

use furama_resorts;
create table `position` (
`position_id` int primary key,
`position_name` varchar (45),
`status` bit (1) default (0)
);

create table `education_degree` (
`education_degree_id` int primary key,
`education_degree_name` varchar (45),
`status` bit (1) default (0)
);

create table `division` (
`division_id` int primary key,
`division_name` varchar (45),
`status` bit (1) default (0)
);

create table `role`(
`role_id` int primary key auto_increment,
`role_name` varchar(255),
`status` bit (1) default (0)
);

create table `user`(
`user_name` varchar (225) primary key,
`password` varchar(255),
`status` bit (1) default (0)
);

create table `user_role`(
`role_id` int,
`user_name` varchar(255),
foreign key(`role_id`) references role(`role_id`),
foreign key(`user_name`) references user(`user_name`),
`status` bit (1) default (0)
);

create table `rent_type` ( 
`rent_type_id` int primary key,
`rent_type_name` varchar (45),
`rent_type_cost` Double,
`status` bit (1) default (0)
);

create table `service_type`(
`service_type_id` int primary key,
`service_type_name` varchar(45),
`status` bit (1) default (0)
);

create table `servive` (
`service_id` INT primary key,
`service_name` VARCHAR(45),
`service_area` INT,
`service_cost` DOUBLE,
`service_max_people` INT,
`rent_type_id` INT,
`service_type_id` INT,
`standard_room` VARCHAR(45),
`description_other_convenience` VARCHAR(45),
`pool_area` DOUBLE,
`number_of_floors` INT,
foreign key (`rent_type_id`) references `rent_type`(`rent_type_id`),
foreign key (`service_type_id`) references `service_type`(`service_type_id`),
`status` bit (1) default (0)
);


create table `customer_type`(
`customer_type_id` int primary key,
`service_type_name` varchar(45),
`status` bit (1) default (0)

);

create table `employee` (
`employee_id` INT primary key,
`employee_name` VARCHAR(45),
`employee_birthday` DATE,
`employee_id_card` VARCHAR(45),
`employee_salary` DOUBLE,
`employee_phone` VARCHAR(45),
`employee_email` VARCHAR(45),
`employee_address` VARCHAR(45),
`position_id` INT,
`education_degree_id` INT,
`division_id` INT,
`user_name` VARCHAR(255),
foreign key (`position_id`) references `position`(`position_id`),
foreign key (`education_degree_id`) references `education_degree`(`education_degree_id`),
foreign key (`division_id`) references `division`(`division_id`),
foreign key (`user_name`) references `user`(`user_name`),
`status` bit (1) default (0)

);

create table `customer` (
`customer_id` INT primary key,
`customer_type_id` INT,
`customer_name` VARCHAR(45),
`customer_birthday` DATE,
`customer_gender` BIT(1),
`customer_id_card` VARCHAR(45),
`customer_phone` VARCHAR(45),
`customer_email` VARCHAR(45),
`customer_address` VARCHAR(45),
 foreign key (`customer_type_id`) references `customer_type`(`customer_type_id`),
 `status` bit (1) default (0)

);

create table `attach_service` (
`attach_service_id` int primary key,
`attach_service_name` varchar(45),
`attach_service_cost` double,
`attach_service_unit` int, 
`attach_service_status` varchar (45),
`status` bit (1) default (0)

);

create table `contract`(
`contract_id` int primary key,
`contract_star_date` datetime,
`contract_end_date` datetime,
`contract_deposit` double,
`contract_total_money` double,
`employee_id` int,
`customer_id` int,
`service_id` int,
foreign key (`employee_id`) references `employee`(`employee_id`),
foreign key (`customer_id`) references `customer`(`customer_id`),
foreign key (`service_id`) references `servive`(`service_id`),
`status` bit (1) default (0)

);

create table `contract_detail` (
`contract_detail_id` int primary key,
`contract_id` int,
`attach_service_id` int,
`quantity` int,
foreign key (`contract_id`) references `contract`(`contract_id`),
foreign key (`attach_service_id`) references `attach_service` (`attach_service_id`),
`status` bit (1) default (0)
);



