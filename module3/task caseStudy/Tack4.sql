use furama_resort;
select khach_hang.ma_khach_hang,khach_hang.ho_ten, count(hop_dong.ma_khach_hang) as so_lan_dat_phong 
from khach_hang
inner join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
where ma_loai_khach=(select ma_loai_khach from loai_khach where ten_loai_khach='Diamond')
group by khach_hang.ma_khach_hang
order by so_lan_dat_phong

