Alter table boarder modify no number(10); 
Alter table boarder modify contents varchar2(3600); 
Alter table boarder drop column pw; 
Alter table reply add r_regdate date;

drop table boarder cascade constraints;
drop sequence seq_boarder_no;
drop table reply;
drop sequence seq_reply_no;

// boarder table ����
create table boarder(
               no number(4) primary key,
               title varchar2(100) not null,
               viewcount number(20) not null,
               regdate date not null,
               subtitle varchar2(10),
               n_id varchar2(20) references member(n_id),
               contentType char,
               contents varchar2(3600) not null 
               ) 
               // 8�� �÷�
// reply table ����                 
create table reply(
               no number(4) references boarder(no),
               r_no number(4) primary key,
               r_n_id varchar2(20) references member(n_id),
               r_contents varchar2(500),
               r_regdate date 
              ); 
               
create sequence seq_boarder_no
increment by 1
start with 1
nocycle
nocache;
              
create sequence seq_reply_no
increment by 1
start with 1
nocycle
nocache;         

select * from boarder;
//no title viewcount regdate subtitle r_n_id contentType contents 8�� �÷�
insert into boarder values(seq_boarder_no.nextval,'���� ǥ���ϴ� �����',232,'19-03-28','����','����01','1','�̴� ��� �� ... �մϴ�.');
insert into boarder values(seq_boarder_no.nextval,'������ �����ͺ��̽�',22,'19-03-27','����','����02','1','�̴� ��� �� ... ����Ű��, Ʃ���� �����ϰ� �ĺ��� �� �ִ� �ϳ��� �Ӽ� Ȥ�� �Ӽ��� ������ ���մϴ�.');
insert into boarder values(seq_boarder_no.nextval,' Ű�� ���� Ʃ��',123,'19-03-26','����','����03','1','�̴� ��� �� ... ����Ű��, Ʃ���� �����ϰ� �ĺ��� �� �ִ� �ϳ��� �Ӽ� Ȥ�� �Ӽ��� ������ ���մϴ�.');
insert into boarder values(seq_boarder_no.nextval,'���� ���Ǿ��� �ۼ�',40,'19-03-25','����','����04','1','�̴� ��� �� ... ����Ű��, Ʃ���� �����ϰ� �ĺ��� �� �ִ� �ϳ��� �Ӽ� Ȥ�� �Ӽ��� ������ ���մϴ�.');
insert into boarder values(seq_boarder_no.nextval,' ����Ű(Super Key) : ����Ű(��',96,'19-03-24','����','����01','1','�̴� ��� �� ... ����Ű��, Ʃ���� �����ϰ� �ĺ��� �� �ִ� �ϳ��� �Ӽ� Ȥ�� �Ӽ��� ������ ���մϴ�.');
insert into boarder values(seq_boarder_no.nextval,'����ȣ �̾� �ڻﱸ����',1315,'19-03-23','����','����05','1','�̴� ��� �� ... ����Ű��, Ʃ���� �����ϰ� �ĺ��� �� �ִ� �ϳ��� �Ӽ� Ȥ�� �Ӽ��� ������ ���մϴ�.');
insert into boarder values(seq_boarder_no.nextval,'ä���  ��ȸ ��ȸ�� ���',156,'19-03-22','����','����06','1','�̴� ��� �� ... ����Ű��, Ʃ���� �����ϰ� �ĺ��� �� �ִ� �ϳ��� �Ӽ� Ȥ�� �Ӽ��� ������ ���մϴ�.');
insert into boarder values(seq_boarder_no.nextval,'�����з� �̴� ��',978,'19-03-20','����','����07','1','�̴� ��� �� ... ����Ű��, Ʃ���� �����ϰ� �ĺ��� �� �ִ� �ϳ��� �Ӽ� Ȥ�� �Ӽ��� ������ ���մϴ�.');
insert into boarder values(seq_boarder_no.nextval,'�ڽ��� 2,120��� ',1523,'19-03-21','����','����03','1','�̴� ��� �� ... ����Ű��, Ʃ���� �����ϰ� �ĺ��� �� �ִ� �ϳ��� �Ӽ� Ȥ�� �Ӽ��� ������ ���մϴ�.');
insert into boarder values(seq_boarder_no.nextval,'������ �ⱹ���� ���� �̸� �˾ƺô���',4156,'19-03-22','����','����01','1','�̴� ��� �� ... ����Ű��, Ʃ���� �����ϰ� �ĺ��� �� �ִ� �ϳ��� �Ӽ� Ȥ�� �Ӽ��� ������ ���մϴ�.');
insert into boarder values(seq_boarder_no.nextval,'�� �߶��� 10��顦�ִ� ¡�� 10�� ����',15,'19-03-28','����','����04','1','�̴� ��� �� ... ����Ű��, Ʃ���� �����ϰ� �ĺ��� �� �ִ� �ϳ��� �Ӽ� Ȥ�� �Ӽ��� ������ ���մϴ�.');


   
   
//no r_no r_n_id r_contents
insert into reply values(75,seq_reply_no.nextval,'����01','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-28'); 
insert into reply values(77,seq_reply_no.nextval,'����02','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-29'); 
insert into reply values(1,seq_reply_no.nextval,'����02','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-29'); 
insert into reply values(2,seq_reply_no.nextval,'����03','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-18'); 
insert into reply values(2,seq_reply_no.nextval,'����04','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-18'); 
insert into reply values(2,seq_reply_no.nextval,'����01','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-19'); 
insert into reply values(4,seq_reply_no.nextval,'����04','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-16'); 
insert into reply values(4,seq_reply_no.nextval,'����04','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-16'); 
insert into reply values(5,seq_reply_no.nextval,'����01','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-25'); 
insert into reply values(5,seq_reply_no.nextval,'����05','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-26'); 
insert into reply values(5,seq_reply_no.nextval,'����01','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-26'); 
insert into reply values(11,seq_reply_no.nextval,'����05','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-28'); 
insert into reply values(11,seq_reply_no.nextval,'����01','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-28'); 
insert into reply values(11,seq_reply_no.nextval,'����05','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-28'); 
insert into reply values(9,seq_reply_no.nextval,'����01','���������� �����ϱ�.  ��ó: https://blog.kjslab.com/11','19-03-28'); 
insert into reply values(10,seq_reply_no.nextval,'����01','',''); 
select * from boarder;
select * from reply;

// join test 

// ��� ����Ʈ test
select b.no,b.title, b.regdate, b.n_id, b.contents, r.r_no, r.n_id, r.r_regdate, r.r_contents from boarder b, reply r where b.no(+)=r.no order by r_regdate, b.no, r.r_no; 
// ����� ã�� �ʿ䰡 ������? // ���� ����� ã�� �ʿ䰡 �ִٸ� ��� ã�� �� reply table�� rownum���� ã�� ��� ���� �� ����.
select r.r_no, r.n_id, b.contents, r.r_contents,b.regdate,r.r_regdate from boarder b, reply r where b.no(+)=r.no order by r_regdate, b.no, r.r_no;
select count(*) from boarder b, reply r where b.no=r.no(+) order by r_regdate, b.no, r.r_no;
select count(*) from boarder b, reply r where b.no(+)=r.no order by r_regdate, b.no, r.r_no; 
select count(*) from boarder b, reply r where b.no=r.no(+) and r.n_id is null order by r_regdate, b.no, r.r_no; 

/* �Խ��� ����Ʈ(board.jsp)*/
// getAll
select no, subtitle, title, n_id, viewcount, regdate from boarder;

// FindById, FindBySubtitle, FindByTitle
select no, subtitle, title, n_id, viewcount, regdate from boarder where n_id='?';
select no, subtitle, title, n_id, viewcount, regdate from boarder where subtitle='?';
select no, subtitle, title, n_id, viewcount, regdate from boarder where title like '%?%'); 

// InsertAll
insert into boarder (no, subtitle, title, n_id, viewcount, regdate) values (?,?,?,?,?,?);

// DeleteAll ����Ʈ, �۳���, ��۱��� �Ѳ����� ����?! cascade �̿�
delete from boarder where no = ? cascade;

// UpdateAll : ����Ʈ, �۳��� ���� ������ �߰��ؾ��ϳ�...?!
update boarder set subtitle=?, title=?, regdate=? where no=?;



/* �Խñ�, ��� �б� : join���� ����!(Boardcontent.jsp) ������ ������ ���� 3���� ��� ��� �ۼ�. */

// �Խñ� ��ü�� ��� ���� �͵� null�� ä������ ���� // 1���� �Խñۿ� ��� �������� �ִٸ� 1���� �Խñ� ���� �ߺ����� ������+������ ���
select b.no,b.title, b.regdate, b.n_id, b.contents, r.r_no, r.n_id, r.r_regdate, r.r_contents from boarder b, reply r where b.no=r.no(+) order by r_regdate, b.no, r.r_no; 
// �Խñۿ� ��� �ִ� �͸� ���
select b.no,b.title, b.regdate, b.n_id, b.contents, r.r_no, r.n_id, r.r_regdate, r.r_contents from boarder b, reply r where b.no(+)=r.no order by r_regdate, b.no, r.r_no; 
// �Խñۿ� ��� ���� �͸� ���
select b.no,b.title, b.regdate, b.n_id, b.contents, r.r_no, r.n_id, r.r_regdate, r.r_contents from boarder b, reply r where b.no=r.no(+) and r.n_id is null order by r_regdate, b.no, r.r_no; 


/* �Խñ� */
// InsertBoard >> ���� InsertAll�� �ٸ� ���� ������ ���ٴ� ��? ���⼭ �߰��Ҷ� InsertAll���� ���ÿ� ���� ������ �߰� �Ǿ�� ��.
insert into boarder (no, subtitle, title, n_id, viewcount, regdate, contents) values (?,?,?,?,?,?,?);

// DeleteBoard >> ���� DeleteAll�� ������ �ٸ���? 

// UpdateBoard >> defalut������ ���� �ִ� ���� �ְ� �����ϴ� ����.
update boarder set contents=? where no=?;

 
/* ��� no r_no n_id r_contents r_regdate */
// InsertReply
insert into reply (no, r_no, n_id, r_regdate, r_contents) values (?,?,?,?,?);

// DeleteReply
delete from reply where r_no=?;

// UpdateReply
update reply set r_contents where r_no?;






select * from boarder where no = 2




