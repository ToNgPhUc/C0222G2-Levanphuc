drop database if exists quan_li_sinh_vien;
create database if not exists quan_li_sinh_vien;
use quan_li_sinh_vien;
create table class(
class_id int not null auto_increment primary key,
class_name varchar (60) not null,
start_date datetime not null,
status1 bit 
);
create table Student(
    student_id   int         not null auto_increment primary key ,
    student_name varchar(30) not null,
    address     varchar(50),
    Phone     varchar(20),
    status_1      bit,
    class_id     int         not null,
   foreign key (class_id) references class (class_id)
);
create table subject_1(
sub_id int not null auto_increment primary key,
sub_name varchar (30) not null ,
credit tinyint not null default 1 check (credit >=1) ,
status_1 bit default 1
);
create table mark(
mark_id    int not null auto_increment primary key,
sub_id     int not null,
student_id int not null,
mark       float  default 0 check (mark between 0 and 100),
exam_times tinyint default 1,
unique (sub_id,student_id),
foreign key (sub_id) references subject_1(sub_id),
foreign key (student_id)references student(student_id)
);
use quan_li_sinh_vien;
select student.*from student
where student.student_name like 'H%';

select class.*from class
where month(start_date)=12;

 select subject_1.*from subject_1
 where credit between 3 and 5;
 
set sql_safe_updates =0;
update student set class_id = 2
where student_name = 'hung' ;
set sql_safe_updates =1;

select student.student_name,subject_1.sub_name,mark 
from ((student
inner join mark on student.student_id= mark.student_id)
inner join subject_1 on mark.sub_id= subject_1.sub_id)
order by mark desc, student_name asc ;