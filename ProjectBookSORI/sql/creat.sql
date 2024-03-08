
########### 책정보 추가 ##########
insert into librarys values (null, '어린왕자', '생텍쥐페리', '갈리마르','1943-04-01');
insert into librarys values (null, '홍길동전', '정족목', '창비','2003-04-25');
insert into librarys values (null, '이상한나라의 엘리스', '찰스 루트위지', '맥밀란','1865-11-26');
insert into librarys values (null, '심장 없는 남자', '아트포어스', null ,'2019-09-09');
insert into librarys values (null, '인간실격', '찰스 루트위지', '맥밀란','1865-11-26');
insert into librarys values (null, '이게 책제목?', '김소리', '아무거나',null);
insert into librarys values (null, '원피스', '오다', '몰루', null);
insert into librarys values (null, '짱구는 못말려', '흰둥이', null, '1998-04-23');
############ 회원추가 ############
insert into members values (null, 'qwer', '1234a', '김소리','010-1234-5643', '경기도');
insert into members values (null, 'dkdlel', 'qlqjs', '이준기','010-2343-6411', '서울');
insert into members values (null, 'dkssud', 'dkssud', '강지원','010-9835-4393', '부산');
insert into members values (null, 'asd', 'asd', '이효리','010-9435-4243', '제주도');
############ 랜트정보 ############
insert into rents values (null, 1, 1, date_format(now(), '%Y/%m/%d'),null);
insert into rents values (null, 4, 2, date_format(now(), '%Y/%m/%d'),null);
insert into rents values (null, 2, 7, date_format(now(), '%Y/%m/%d'),null);
################################
select * from librarys;
select * from members;
select * from rents;
################################
ALTER TABLE librarys AUTO_INCREMENT=1;
select l.book_id, title, author, pubs, pub_date,
	   case when (rent_date is null) or (rent_date is not null and return_date is not null) then '대여가능'
		    else '대여중' end 'state'
from librarys l left join rents r
on l.book_id = r.book_id;


update librarys 
set book_id = 4,
	title = '심장 없는 남자',
	author = null,
    pubs = '아트 포어스',
    pub_date = '2019-09-09'
where book_id = 4;

delete from librarys where book_id = 7 ;
select l.book_id, title, author, pubs, pub_date,
	   case when (rent_date is null) or (rent_date is not null and return_date is not null) then '대여가능'
		    else '대여중' end 'state'
from librarys l left join rents r
on l.book_id = r.book_id;
where title like '%원%';


                        
select l.book_id, title, author, pubs, pub_date, rent_date, return_date, '대여중' state
from librarys l, rents r
where rent_date is not null
and return_date is null
and l.book_id = r.book_id;

select l.book_id, '대여중' state from librarys l, rents r
where rent_date is not null and return_date is null and l.book_id = r.book_id;


insert into rents
values (null, (select member_num from members where member_id = 'qwer'), 
			  (select book_id from librarys where book_id = 3), 
		date_format(now(), '%Y/%m/%d'),null);
        
select book_id, member_id from librarys, members;

select l.book_id from librarys l, rents r 
where rent_date is not null and return_date is null and l.book_id = r.book_id;

select member_id from members;

select book_id
from librarys
where book_id = 3;

select member_num
from members
where member_id = 'qwer';

insert into rents values (null, 7, now(),null);

update rents set return_date = now()
where book_id = 7 and return_date is null;


################################
select * from librarys;
select * from members;
select * from rents;
################################

