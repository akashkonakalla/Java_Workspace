/*
*Today's Assignment*
Java-
1.A company records attendance for different employees.
Create an interface Attendance with method markAttendance().
Implement Developer, Tester, and Manager.
Display attendance messages with employee roles.

PL/SQL-
1. Create an *AFTER UPDATE* trigger on the employee table.
whenever an employee's salary is updated, automatically insert the employee number, old salary, and new salary into *salary_audit table*.
2.Create an explicit cursor to fetch employees whose salary is greater than 50000.
Display employee number, name, and salary.
*/

-- 1)
create table salary_audit(
sno int auto_increment primary key,
empno int, 
oldsal int,
newsal int
)

delimiter $$
drop trigger if exists afterUpdateSal;
create trigger afterUpdateSal
after update
on emp
for each row
begin
if old.sal != new.sal then
insert into salary_audit(empno,oldsal,newsal) values(old.empno,old.sal,new.sal);
end if;
end
$$

select *from salary_audit;
update emp set sal=5100 where empno = 7839;

--2)

delimiter $$
drop procedure if exists cursorP;
create procedure cursorP()
begin
declare finished int default 0;
declare eNo int default 0;
declare eNme varchar(40) default '';
declare eSal int default 0;
declare empsal cursor for 
select empno,ename,sal from emp where sal>50000;
declare continue handler for not found set finished =1;
open empsal;
label:loop
fetch empsal into eNo,eNme,eSal ;
if finished =1 then
 leave label;
end if;
select eNo,eNme,eSal;
end loop;
close empsal;
end
$$
call cursorP(@ans);
select @ans;
