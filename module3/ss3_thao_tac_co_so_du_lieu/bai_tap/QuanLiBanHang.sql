use quan_li_ban_hang;
insert into customer (c_id,c_name,c_age) value 
(1,'minh quan',10),
(2,'ngoc oanh',20),
(3,'hong ha',50);
 insert into Order1 (o_id,c_id,o_date,o_total_price) value 
 (1,1,'20060321',null),
 (2,2,'20060323',null),
 (3,1,'20060316',null);
 insert into product (p_id,p_name,p_price) value 
 (1,'may giat', 3),
 (2,'tu lanh', 5),
  (3,'dieu hoa', 7),
   (4,'quat', 1),
    (5,'bep dien', 2);
    insert into order_detail value
    (1,1,3),
    (1, 3,7),
	(1,4 ,2),
	(2,1 ,1),
	(3,1 ,8),
	(2,5 ,4),
	(2,3 ,3);
    
    
select order1.o_id,order1.o_date, order1.o_total_price from order1;
    
select customer.c_name, product.p_name from customer
join order1 on customer.c_id= order1.c_id
join order_detail on order1.o_id= order_detail.o_id
join product on order_detail.p_id= product.p_id;

select customer.c_name  from customer
where not exists (select order1.* from order1 where  order1.c_id = customer.c_id);

select order1.o_id,order1.o_date, sum(order_detail.od_qty*product.p_price) as tong_gia_ban from order1
join order_detail on order1.o_id=  order_detail.o_id
join product on order_detail.p_id= product.p_id
group by order1.o_id;
     
    
