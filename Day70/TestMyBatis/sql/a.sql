create table product(
no number(4) primary key,
item varchar2(20),
price number(10),
regdate date)

create sequence seq_no 
increment by 1
start with 1
nocycle
nocache;

insert into product values(seq_no.nextval, 'PC', 2000000, '2019-02-15');
insert into product values(seq_no.nextval, 'PC', 1800000, '2019-01-15');
insert into product values(seq_no.nextval, 'Note_book', 1500000, '2018-06-14');
insert into product values(seq_no.nextval, 'DeskTop', 2500000, '2019-02-01');
insert into product values(seq_no.nextval, 'Mac', 3000000, '2018-07-01');
insert into product values(seq_no.nextval, 'Mac', 3500000, '2018-09-01');

select * from product;
