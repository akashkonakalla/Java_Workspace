/*
SQL

1.Write a query to display employees who work in the same department as employee 'SCOTT'.

2.Display employees whose salary is greater than 3000, along with their department name.

3.Find the average salary of each department along with the department name.
*/

use dailytasks;
select *from emp where deptno in (select deptno from emp where ename = 'scott');

select e.empno,e.ename,e.deptno, d.dname from emp e join dept d where e.sal>3000 and e.deptno=d.deptno ;

select e.deptno,d.dname,avg(sal) as 'Average Salary' from emp as e inner join dept as d on e.deptno = d.deptno group by e.deptno;