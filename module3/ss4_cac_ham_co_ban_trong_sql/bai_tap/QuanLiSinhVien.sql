 -- drop database if exists quan_li_sinh_vien;
CREATE DATABASE QuanLySinhVien;
USE QuanLySinhVien;
CREATE TABLE Class
(
    ClassID   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ClassName VARCHAR(60) NOT NULL,
    StartDate DATETIME    NOT NULL,
    Status    BIT
);
CREATE TABLE Student
(
    StudentId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    StudentName VARCHAR(30) NOT NULL,
    Address     VARCHAR(50),
    Phone       VARCHAR(20),
    Status      BIT,
    ClassId     INT         NOT NULL,
    FOREIGN KEY (ClassId) REFERENCES Class (ClassID)
);
CREATE TABLE Subject
(
    SubId   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubName VARCHAR(30) NOT NULL,
    Credit  TINYINT     NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
    Status  BIT                  DEFAULT 1
);
CREATE TABLE Mark
(
    MarkId    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubId     INT NOT NULL,
    StudentId INT NOT NULL,
    Mark      FLOAT   DEFAULT 0 CHECK ( Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE (SubId, StudentId),
    FOREIGN KEY (SubId) REFERENCES Subject (SubId),
    FOREIGN KEY (StudentId) REFERENCES Student (StudentId)
);


              -- ss3 [Thực hành] Thêm dữ liệu vào trong cơ sở dữ liệu quản lý sinh viên
USE QuanLySinhVien;
INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);

INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
 INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);   
       
       
       
       -- ss3 [Thực hành] Truy vấn dữ liệu với CSDL Quản lý sinh viên
use QuanLySinhVien;
SELECT *
FROM Student;

SELECT *
FROM Student
WHERE Status = true;

SELECT *
FROM Subject
WHERE Credit < 10;

SELECT S.StudentId, S.StudentName, C.ClassName
FROM Student S join Class C on S.ClassId = C.ClassID;

SELECT S.StudentId, S.StudentName, C.ClassName
FROM Student S join Class C on S.ClassId = C.ClassID
WHERE C.ClassName = 'A1';

SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId;

SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF'; 



            -- ss3 [Bài tập] Truy vấn dữ liệu với CSDL Quản lý sinh viên
use QuanLySinhVien;
-- Hiển thị số lượng sinh viên ở từng nơi
select address,studentname, count(studentid) as so_luong_sinh_vien 
from student
group by address,studentname;

-- Tính điểm trung bình các môn học của mỗi học viên
select student.studentid,student.studentname, avg(mark) as diem_trung_binh
from student 
join mark on student.studentid= mark.studentid
group by student.studentid, student.studentname;


-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select student.studentid, student.studentname, avg(mark) as diem_trung_binh
from student 
join mark on student.studentid = mark.studentid
group by student.studentid, student.studentname
having diem_trung_binh > 15;


-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
select student.studentid,student.studentname, avg(mark) as diem_trung_binh
from student 
join mark on student.studentid= mark.studentid
group by student.studentid,student.studentname
having diem_trung_binh >= all (select avg(mark) from mark group by mark.studentid);


         -- ss4 [Bài tập] Luyện tập các hàm thông dụng trong SQL
         
         -- 1; Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
         -- 2; Hiển thị các thông tin môn học có điểm thi lớn nhất.
		-- 3; Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
         
         
 use quanlisinhvien;
 --    1;
 select max(credit)as credit_cao_nhat, subject.*  from Subject;
 
 --    2;
 select max(mark) as diem_cao_nhat, Subject.* from Subject
 left join mark on subject.subid=mark.subid;
 
 -- 3;
 select avg (mark) as diem_trung_binh , student.* from Student 
 left join mark on student.studentid = mark.studentid
 group by StudentId
 order by mark desc;
 
 
 
 
         