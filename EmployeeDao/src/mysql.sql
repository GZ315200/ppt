drop table if exists employee;
create table  employee(
	id int auto_increment primary key,   
	name varchar(32),  
	joinTime datetime,
	gender boolean,
	job varchar(10),
	salary double
); 