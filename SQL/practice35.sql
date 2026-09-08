/*
PL/SQL- 08/09/2026
1. Create a "BEFORE INSERT" trigger on the "employee table.
When a new employee is about to insert:
>  If the salary is less than 15000, automatically change the salary to 15000.
› otherwise, keep the salary as entered.
*/

CREATE TABLE `emp_audit` (
  `sno` int not null auto_increment,
  `empno` int NOT NULL,
  `ename` varchar(10) NOT NULL,
  `job` varchar(15) NOT NULL,
  `mgr` int DEFAULT NULL,
  `hiredate` date NOT NULL,
  `sal` int NOT NULL,
  `comm` int DEFAULT NULL,
  `deptno` int NOT NULL,
`createdOn` date,
`remarks` varchar(40),
  PRIMARY KEY (`sno`)
  
)

delimiter $$
drop trigger if exists beforeInsertEmp $$
create trigger beforeInsertEmp
before insert
on emp
for each row
begin 
if new.sal < 15000 then 
set new.sal=15000;
end if;
end
$$
select *from emp;
insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) values(4444,'AKASH','CEO',NULL,'2004-08-24',4444.00,NULL,20);

