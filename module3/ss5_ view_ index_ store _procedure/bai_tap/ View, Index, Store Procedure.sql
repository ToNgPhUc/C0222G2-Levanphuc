create database demo;
use demo;
create table Products(
id int primary key,
product_Code int ,
product_Name varchar (255),
product_Price double, -- gia sp
product_Amount int,   -- sluong sp
product_Description varchar (255),-- Mô tả Sản phẩm
product_Status bit(1) default 0);-- trang thai sp
insert into Products (id,product_Code, product_Name, product_Price, product_Amount, product_Description) value 
(1,5,"xe điện",5000,2,"màu đen"),
(2,10,"ô tô",10000,2,"màu đỏ"),
(3,15,"xe tải ",15000,1,"màu vang"),
(4,20,"xe máy",20000,10,"màu trắng");

-- b3 Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
explain select * from products;
create unique index unique_index on products(product_code);
create index composite_index on products (products_name,product_prince);  -- composite_index chi so tong hop
explain select * from products;

-- b4 Bước 4:
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
-- Tiến hành sửa đổi view
-- Tiến hành xoá view


create view view_products as
select product_code,product_name,product_price, product_status from products;

select * from view_products ;

update view_products
set product_name ="xe"
where product_code = 10;

delete from view_products
where product_code = 5;

drop view view_products;
 
--  Bước 5:

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
-- Tạo store procedure thêm một sản phẩm mới
-- Tạo store procedure sửa thông tin sản phẩm theo id
-- Tạo store procedure xoá sản phẩm theo id



delimiter //
create procedure get_all_products()
begin 
	select * from products;
end //
delimiter ;
call procedure_products();

