drop database if exists coffee_store;
create database coffee_store;

use coffee_store;

CREATE TABLE app_user (
  user_id bigint not null auto_increment,
  is_deleted bit(1) default 0,
  user_password varchar(128) not null default '123456',
  user_name varchar(36) not null unique,
  primary key (user_id)
);

-- alter table app_user add constraint app_user_pk primary key (user_id);

alter table app_user add constraint app_user_uk unique (user_name);

create table app_role ( 
	role_id bigint not null auto_increment,
	is_deleted bit(1) default 0,
	role_name varchar(30) not null unique,
	primary key (role_id)
);

-- alter table app_role add constraint app_role_pk primary key (role_id);

-- alter table app_role add constraint app_role_uk unique (role_name);

create table user_role ( 
	id bigint not null auto_increment,
	is_deleted bit(1) default 0,
	role_id bigint not null,
	user_id bigint not null,
	primary key (id),
	constraint user_id foreign key (user_id) references app_user (user_id),
	constraint role_id foreign key (role_id) references app_role (role_id)
);

-- alter table user_role add constraint user_role_pk primary key (id);

-- alter table user_role add constraint user_role_uk unique (user_id, role_id);

-- alter table user_role add constraint user_role_fk1 foreign key (user_id) references app_user (user_id); 

-- alter table user_role add constraint user_role_fk2 foreign key (role_id) references app_role (role_id);

create table `position` (
	position_id int auto_increment primary key,
	name_position varchar(255) not null,
	is_deleted bit(1) default 0
);

create table employee (
	employee_id int auto_increment primary key,
	employee_name varchar(255) not null,
	birthday date,
    gender int,
	phone varchar(255) not null,
	address varchar(255) not null,
	salary double not null,
	image text not null,
	position_id int,
	user_id bigint,
	foreign key(position_id) references `position`(position_id),
	foreign key(user_id) references app_user(USER_ID),
	is_deleted bit(1) default 0
);

create table dish_type(
	dish_type_id int auto_increment primary key,
	dish_type_code varchar(255),
	dish_type_name varchar(255),
	is_deleted bit(1) default 0
);
create table dish(
	dish_id int auto_increment primary key,
	dish_code varchar(255),
	dish_name varchar(255),
	dish_price bigint,
	dish_type_id int not null,
    image text not null,
    dish_date_create date,
	is_deleted bit(1) default 0,
	foreign key (dish_type_id) references dish_type (dish_type_id)
);

create table table_manager(
	table_id int primary key auto_increment,
	table_number varchar(255),
    table_status bit(1) default 0,
    is_empty bit(1) default 0,
	is_deleted bit(1) default 0
);

create table bill(
	bill_id int auto_increment primary key,
	dish_id int,
	bill_code varchar(255),
    create_date date,
	is_deleted bit(1) default 0
);

create table order_dish(
	order_id int auto_increment primary key,
    table_id int not null,
    order_code varchar(255) not null,
    quantity int,
    dish int,
    bill_id int,
    employee_id int,
    is_deleted bit(1) default 0,
    foreign key (table_id) references table_manager(table_id),
    foreign key (bill_id) references bill(bill_id),
    foreign key (employee_id) references employee(employee_id),
    foreign key (dish) references `dish`(dish_id)
);

create table feedback(
	feedback_id int auto_increment primary key,
    creator varchar(255),
    feedback_code varchar(255),
    email varchar(255),
    content MEDIUMTEXT,
    rating int,
    image MEDIUMTEXT,
    feedback_date date,
    is_deleted bit(1) default 0
);