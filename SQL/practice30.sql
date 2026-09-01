/*
Sql- 
1.Write a Stored procedure that expect empno as input and returns employee job , salary.
 */
 
 use dailytasks;
 
 delimiter $$
 create procedure proc(in eNo int)
 begin
 select job,sal from emp where empno=eNo ;
 end $$
 
 call proc(7839);