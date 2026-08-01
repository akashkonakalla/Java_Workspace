use dailytasks;
select deptno, avg(sal) from emp group by deptno having avg(sal)>2000;
select deptno, count(comm) from emp group by deptno having count(comm)>2;
