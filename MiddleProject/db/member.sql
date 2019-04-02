drop table member;


create table member(

id varchar2(20) primary key,
pw varchar2(20) NOT NULL,
n_id varchar2(20) NOT NULL UNIQUE,
tel varchar2(20) NOT NULL,
sido varchar2(20) NOT NULL,
gu varchar2(20) NOT NULL,
doro varchar2(20) NOT NULL,
d_juso varchar2(50),
postno varchar2(20) NOT NULL,
email varchar2(20) NOT NULL UNIQUE,
u_sex varchar(1) NOT NULL,
u_birthday date NOT NULL,
u_name varchar2(20) NOT NULL,
u_enrollday date NOT NULL,
status varchar(1) NOT NULL,
manage varchar(1) NOT NULL,
petcount number(20) NOT NULL,
friend varchar(1),
f_id varchar2(20)
);

insert into member values('user01','0001','����01','010-01','�����','���ʱ�','����� 11�� 35','������� 6�� 601ȣ','06727','user01@naver.com','2','1990-01-01','�躽��','2019-03-26','1','1','1','1','user02');
insert into member values('user02','0002','����02','010-02','�����','���ʱ�','����� 11�� 35','������� 6�� 602ȣ','06727','user02@naver.com','1','1991-02-02','������','2019-03-26','1','2','1','1','user07');
insert into member values('user03','0003','����03','010-03','�����','���ʱ�','����� 11�� 35','������� 6�� 603ȣ','06727','user03@naver.com','2','1992-03-03','�Ѽұ�','2019-03-26','1','0','1','1','user01');
insert into member values('user04','0004','����04','010-04','�����','���ʱ�','����� 11�� 35','������� 6�� 604ȣ','06727','user04@naver.com','1','1993-04-04','������','2019-03-26','0','1','1','1','user07');
insert into member values('user05','0005','����05','010-05','�����','���ʱ�','����� 11�� 35','������� 6�� 605ȣ','06727','user05@naver.com','2','1994-05-05','�ڰ���','2019-03-26','1','1','1','1','user08');
insert into member values('user06','0006','����06','010-06','�����','���ʱ�','����� 11�� 35','������� 6�� 606ȣ','06727','user06@naver.com','1','1995-06-06','�̻���','2019-03-26','0','0','1','1','user01');
insert into member values('user07','0007','����07','010-07','�����','���ʱ�','����� 11�� 35','������� 6�� 607ȣ','06727','user07@naver.com','2','1996-07-07','�ֱ��','2019-03-26','1','1','1','1','user09');
insert into member values('user08','0008','����08','010-08','�����','���ʱ�','����� 11�� 35','������� 6�� 608ȣ','06727','user08@naver.com','1','1997-08-08','������','2019-03-26','0','1','1','1','user09');
insert into member values('user09','0009','����09','010-09','�����','���ʱ�','����� 11�� 35','������� 6�� 609ȣ','06727','user09@naver.com','2','1998-09-09','�ӻ���','2019-03-26','1','1','1','1','user01');
insert into member values('user10','0010','����10','010-10','�����','���ʱ�','����� 11�� 35','������� 6�� 610ȣ','06727','user10@naver.com','1','1999-10-10','�����','2019-03-26','0','0','0','2','user01');

update member set n_id = 'aaa' where id = 'user09';

select * from member;