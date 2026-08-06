/*
Today Task
Mysql
1.Display employees whose manager is KING.
2.Display departments that have employees.
3.Display departments that do not have any employees.
4.Display employees who earn the same salary as SCOTT.
5.Display employees who earn more than the average salary of their department.
6.Display employees who belong to the department having the highest total salary.
*/
use dailytasks;
set autocommit=0;

select *from emp where mgr=(select empno from emp where ename = 'king');

select deptno,count(deptno) from emp group by deptno having count(deptno)>0;

select *from dept where deptno not in (select distinct deptno from emp);
select deptno from emp where empno in (select empno from emp group by empno having count(*)<0);

select *from emp where sal=(select sal from emp where ename like 'scott');
select *from emp  where sal > (select avg(sal) as average from emp where emp.deptno = emp.deptno );

select *from emp where deptno = (select deptno from emp group by deptno having sum(sal)= (select max(total) from  (select sum(sal) as total from emp group by deptno ) salt ));
