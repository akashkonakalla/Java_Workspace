/*
SQL-
1. Display employee number, employee name, salary, grade, and department name
2. Display department-wise highest paid employee
*/

use dailytasks;
select *from emp;
select *from salgrade;

select empno,ename,sal,s.* from emp e inner join salgrade s on e.sal between s.losal and s.hisal;
select empno,ename,sal,s.grade,d.dname from emp e inner join salgrade s on e.sal between s.losal and s.hisal inner join dept d on e.deptno=d.deptno ;

select e.ename, e.deptno , sal from emp e where sal = (select max(sal) from emp e2 where e.deptno=e2.deptno);