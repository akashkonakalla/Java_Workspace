/*
PL/SQL-
1.Write a Trigger that able to stop the insertion of employees into any department
 if the count of users are 10 and display the message as "employee limit reached in department" 
 use SIGNAL SQLSTATE for message
 */
 
 use dailytasks;
 
 delimiter $$
 
 create trigger warning_check
 before insert on emp
 for each row
 begin
 declare emp_count int default 0;
 select count(*) into emp_count from emp where deptno=new.deptno;
 
 if emp_count>=10 then
 
 signal sqlstate '45000'
 set message_text='employee limit reached in department';

 end if;
 end
 $$
 
select *from emp;
set autocommit =0;
INSERT INTO emp VALUES (800710, 'AKASH', 'JFS', null,'2004-08-24',2000,null, 10);