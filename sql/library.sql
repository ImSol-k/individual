
-- drop database library_db;

 create database library_db
   default character set utf8mb4
     collate utf8mb4_general_ci
     default encryption='n';

CREATE TABLE `librarys` (
	`book_id`	int	auto_increment	primary key,
	`title`	varchar(100)	NOT NULL,
	`author`	varchar(100),
	`pubs`	varchar(100),
	`pub_date`	date
);

CREATE TABLE `members` (
	`member_num`	int	auto_increment	primary key,
	`member_id`	varchar(100)	NOT NULL,
	`member_pw`	varchar(100)	NOT NULL,
	`meber_name`	varchar(100)	NOT NULL,
	`ph`	varchar(100),
	`address`	varchar(100)
);

CREATE TABLE `rents` (
	`rent_id`	int	auto_increment	primary key,
	`member_num`	int,
	`book_id`	int,
	`rent_date`	date,
	`return_date`	date,
    constraint rents_bfk foreign key (book_id)
    references librarys (book_id),
    constraint rents_mfk foreign key (member_num)
    references members (member_num)
);



