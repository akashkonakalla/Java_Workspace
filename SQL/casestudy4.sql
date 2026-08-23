-/*
1. Find Departments located in cities having more than one department.
2. Employees who joined earliest in each department.
*/
select *from dept;

SELECT d.deptno,d.dname
FROM dept d
where loc in (
select d1.loc from dept d1 group by d1.loc having count(d1.deptno)>1 );

select *from emp as e where e.hiredate = (select min(e1.hiredate) from emp as e1 where e1.deptno=e.deptno);

select empno, ename , job , mgr, hiredate, sal, comm , deptno from (select *,(row_number() over( partition by deptno order by hiredate)  ) as rankno from emp e) as t where rankno=1;