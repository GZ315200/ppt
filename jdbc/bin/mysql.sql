create table dept(
	id int auto_increment primary key,   
	name varchar(32),  
	description varchar(255),   
	created_time datetime
); 

create table stu(
  sid int(4) auto_increment primary key,
  sname varchar(20) not null,
  gender char(3) not null,
  age int(3) not null,
  brithday datetime not null
);