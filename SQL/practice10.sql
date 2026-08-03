/*
MySQL
1.Display the employee(s) with the highest salary.
2.Display the employee(s) with the lowest salary.
3.Display the employee(s) earning more than the average salary.
4.Display the employee(s) earning less than the average salary.
5.Display the second highest-paid employee.
6.Display the third highest-paid employee.
*/

use dailytasks;
set autocommit =0;
-- select *from emp order by sal desc limit 1;

-- select *from emp order by sal asc limit 	1;

select *from emp where sal=(select max(sal) from emp);
select *from emp where sal=(select min(sal) from emp);
select *from emp where sal>(select avg(sal) from emp);
select *from emp where sal<(select avg(sal) from emp);
select*from emp order by sal desc,empno asc limit 1,1;
select*from emp order by sal desc,empno asc limit 2,1;
select avg(sal) as akash from emp;

select deptno as deptnumber,count(comm) as commission from emp group by deptno having count(comm)>=2;
