use furama_resort;
select *from nhan_vien
where ho_va_ten like'H%' or ho_va_ten like 'T%'OR ho_va_ten like 'K%' and  length(ho_va_ten)<15
