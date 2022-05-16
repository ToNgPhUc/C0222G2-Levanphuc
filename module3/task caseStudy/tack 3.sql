use furama_resort;
select * from khach_hang
-- where ngay_sinh between '1972-05-15' and '2004-05-15'
where year(current_date())-year(ngay_sinh)>18 and  year(current_date())-year(ngay_sinh)<50
and (dia_chi like '%Đà Nẵng' or dia_chi like '%Quảng Trị');