Alter table boarder modify no number(10); 
Alter table boarder modify contents varchar2(3600); 
Alter table boarder drop column pw; 
Alter table reply add r_regdate date;

drop table boarder cascade constraints;
drop sequence seq_boarder_no;
drop table reply;
drop sequence seq_reply_r_no;

// boarder table 
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
// reply table                 
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
              
create sequence seq_reply_r_no
increment by 1
start with 1
nocycle
nocache;         

select * from boarder;
//no title viewcount regdate subtitle r_n_id contentType contents 8�� �÷�


               
insert into boarder values(seq_boarder_no.nextval,'산책로 추천',0,sysdate,null,'유저01','1','날씨 넘나 좋음^~^');
insert into boarder values(seq_boarder_no.nextval,'산책로 추2천2',0,sysdate,null,'유저01','1','날씨 넘나 좋음^~^2222');
insert into boarder values(seq_boarder_no.nextval,'산책로 추2천2',0,sysdate,null,'aaa','1','날씨 넘나 좋음^~^2222');

   
   
//no r_no r_n_id r_contents
insert into reply values(1,seq_reply_r_no.nextval,'유저02','응듣라두라: https://blog.kjslab.com/11','19-03-29'); 
insert into reply values(2,seq_reply_r_no.nextval,'유저01','응응으응으응: https://blog.kjslab.com/11','19-03-29'); 
insert into reply values(2,seq_reply_r_no.nextval,'aaa','응응으응으응: https://blog.kjslab.com/11','19-03-29'); 
select * from boarder;
select * from reply where no = 75;

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
select no, subtitle, title, n_id, viewcount, regdate from boarder where ?';
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




