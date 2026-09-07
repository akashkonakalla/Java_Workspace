/*
PL/SQL-

1. Write a Stored procedure that accept empno as input 

 > fetch the Sal of emp with that empno  
 > if the salary is 0-2000 show the message as Low salary 
 > if the salary is 2001-9999 Show the message as Good salary
 */
 
 delimiter $$
 drop procedure if exists goodsal;
 create procedure goodSal(in eNo int)
 begin 
 declare salary decimal(10,2);
 select sal into salary from emp where empno = eNo;
 if salary between 0 and 2000 then select 'Low salary';
 else if salary between 2001 and 9999 then select 'good salary';
 end if;
 end if;
 end
 $$
 
 call goodsal(7839);
 select * from emp;
 
 