/*
 *Today's Assignment*
SQL- 
1.List the empno, ename, loc, sal, dname, loc of all the employees belonging to King's department.

2.List the empno, ename, loc, dname of all the departments 10 and 20.
 */
 use dailytasks;
 
 -- 1)
 select e1.empno,e1.ename ,d.loc,e1.sal, e1.deptno,d.dname, d.loc from emp e1 join dept d on e1.deptno=d.deptno where e1.deptno=(select deptno from emp where ename='king');
 select e1.empno,e1.ename ,d.loc,e1.sal, e1.deptno,d.dname, d.loc from emp e1 join dept d  where e1.deptno=d.deptno and e1.deptno=(select deptno from emp where ename='king');
 select e1.empno,e1.ename ,d.loc,e1.sal, e1.deptno,d.dname, d.loc from emp e1 inner join dept d on e1.deptno=d.deptno where e1.deptno=(select deptno from emp where ename='king');
 
 -- 2)
 select e1.empno, e1.ename, d.deptno, d.loc, d.dname from emp as e1 inner join dept as d on e1.deptno= d.deptno where e1.deptno =10 or d.deptno=20;

 select e1.empno, e1.ename, d.deptno, d.loc, d.dname from emp as e1  join dept as d on e1.deptno= d.deptno where e1.deptno in (10,20);
 select e1.empno, e1.ename, d.deptno, d.loc, d.dname from emp as e1  join dept as d where e1.deptno= d.deptno and e1.deptno in (10,20);
 