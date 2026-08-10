/*
Mysql:
1.Display employees who are working in the DALLAS location.

2.Display employee names along with their department names.
*/
use dailytasks;
select *from emp inner join dept on emp.deptno=dept.deptno  where loc like 'dallas';
select *from emp where deptno in(select deptno from dept where loc like 'dallas') ;

select *from dept;
select *from emp;
select ename,(select dname  from dept where emp.deptno =dept.deptno) as department_name from emp;
select ename,dname from emp inner join dept on dept.deptno=emp.deptno ;

