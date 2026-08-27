/*
SQL-
1.Display the top 2 highest paid employees from each department using ROW_NUMBER()
2.Display the first 3 employees hired in each department based on the hire date.
*/

with res as (
select *,row_number() over(partition by deptno order by sal desc) as high from emp
)
select empno, ename, job, mgr, hiredate, sal, comm, deptno, high from res where high in (1,2);

with res1 as(
select *,row_number() over(partition by deptno order by hiredate asc) as joindate from emp
)
select *from res1 where joindate in (1,2,3);