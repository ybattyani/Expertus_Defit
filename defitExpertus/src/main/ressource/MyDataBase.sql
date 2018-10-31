create database employeeDB;
use employeeDB;
create table if not exists employee(
	firstname VARCHAR(50),
	lastname VARCHAR(50),
	salary int
);
insert into employee values('Yoann', 'Battyani', 50000);
insert into employee values('Mike', 'Wazowski', 54000);