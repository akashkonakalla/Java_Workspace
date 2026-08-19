/*
SQL- 19/08/2026
1.List employees whose salary grade is 4 or 5.
2.Display employees whose manager belongs to department 10.
 */
 
 explain select * from emp  inner join salgrade ;
 SELECT * FROM emp e JOIN dept d;
 
SELECT empno,ename,sal,grade FROM emp e, salgrade s where e.sal between s.losal and s.hisal and s.grade in (4,5);
SELECT empno,ename,sal,grade FROM emp e join salgrade as s on sal between losal and hisal where grade in (4,5);

select e.empno , e.ename, e.deptno,e.mgr as 'manager no',m.ename as 'manager name' , m.deptno as 'manager deptno' from emp as e join emp as m on e.mgr=m.empno and m.deptno=10;
select e.empno , e.ename, e.deptno,e.mgr as 'manager no',m.ename as 'manager name' , m.deptno as 'manager deptno' from emp as e ,emp as m where e.mgr=m.empno and m.deptno=10;

 