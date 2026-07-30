/*
Mysql
1.Display the number of employees in each department.
2.Display the total salary paid in each department.
*/
select deptno,count(*) from emp group by deptno;
select deptno, sum(sal) from emp group by deptno;