/*
Mysql
1.Display departments whose total salary is greater than 9000.
2.Display jobs whose maximum salary is greater than 3000.
3.Display departments having at least 2 employees with commission.
4.Display jobs whose minimum salary is greater than 1000.
5.Display departments having less than 4 employees.
*/

select deptno,sum(sal) from emp group by deptno having sum(sal)>9000 ;
select job,max(sal) from emp group by job having max(sal)>3000;
select deptno,count(comm) from emp group by deptno having count(comm)>=2;
select job,min(sal) from emp group by job having min(sal)>1000;
select deptno,count(*) from emp group by deptno having count(*)>4;