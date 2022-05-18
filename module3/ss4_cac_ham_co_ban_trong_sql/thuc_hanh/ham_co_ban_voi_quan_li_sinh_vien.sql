use quan_li_sinh_vien;
-- Hiển thị số lượng sinh viên ở từng nơi
select address,student_name, count(student_id) as so_luong_sinh_vien 
from student
group by address,student_name;

-- Tính điểm trung bình các môn học của mỗi học viên
select student.student_id,student.student_name, avg(mark.mark) as diem_trung_binh
from student 
join mark on student.student_id= mark.student_id
group by student.student_id,student.student_name;


-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select student.student_id,student.student_name, avg(mark.mark) as diem_trung_binh
from student 
join mark on student.student_id= mark.student_id
group by student.student_id,student.student_name
having diem_trung_binh > 15;


-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
select student.student_id,student.student_name, avg(mark.mark) as diem_trung_binh
from student 
join mark on student.student_id= mark.student_id
group by student.student_id,student.student_name
having diem_trung_binh >= all (select avg(mark) from mark group by mark.student_id);





