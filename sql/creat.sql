
########### 책정보 추가 ##########
insert into librarys values (null, '어린왕자', '생텍쥐페리', '갈리마르','1943-04-01');
insert into librarys values (null, '홍길동전', '정족목', '창비','2003-04-25');
insert into librarys values (null, '이상한나라의 엘리스', '찰스 루트위지', '맥밀란','1865-11-26');
insert into librarys values (null, '심장 없는 남자', '아트포어스', null ,'2019-09-09');
insert into librarys values (null, '인간실격', '찰스 루트위지', '맥밀란','1865-11-26');
insert into librarys values (null, '이게 책제목?', '김소리', '아무거나',null);
############ 회원추가 ############
insert into members values (null, 'qwer', '1234a', '김소리','010-1234-5643', '경기도');
insert into members values (null, 'dkdlel', 'qlqjs', '이준기','010-2343-6411', '서울');
insert into members values (null, 'dkssud', 'dkssud', '강지원','010-9835-4393', '부산');
############ 랜트정보 ############
insert into rents values (null, 1, 1, date_format(now(), '%Y/%m/%d'),null);
insert into rents values (null, 1, 2, date_format(now(), '%Y/%m/%d'),null);
insert into rents values (null, 2, 3, date_format(now(), '%Y/%m/%d'),null);
################################
select * from librarys;
select * from members;
select * from rents;
################################

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