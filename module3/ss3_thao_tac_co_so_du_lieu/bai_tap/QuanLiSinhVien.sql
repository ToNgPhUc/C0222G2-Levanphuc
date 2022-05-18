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