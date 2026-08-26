/*
*MySQL*-
1. Find the Emoloyees who have 5th highest salary in the emp table
2. ⁠find the employees who are having last 25% salary groups in  the table
*/

use dailytasks;

with sal_count as (
select *,dense_rank() over(order by sal desc) as rnk from emp 
)
select empno, ename, job,mgr, hiredate,sal, comm,deptno from sal_count where rnk=5 ;

with result as (
select *,ntile(4) over(order by sal desc) as lastppl from emp
) select empno, ename, job, mgr, hiredate, sal, comm, deptno from result where lastppl =4;