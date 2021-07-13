-- member table (member 테이블 생성)
create table member(
num int primary key auto_increment,
id varchar(20) not null,
pass varchar(20) not null,
name varchar(30) not null,
age int not null,
email varchar(30) not null,
phone varchar(30) not null
)

--member 테이블 내용 검색
select * from member;

-- insert (저장)
insert into member(id, pass, name, age, email, phone) values('admin','admin','관리자','31','test@test.com','010-1234-5678');

-- update (수정)
update member set age=30, phone='010-5678-1234' where id='admin';

-- delete (삭제)
delete from member where id='admin';