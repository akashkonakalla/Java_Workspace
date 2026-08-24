/*
SQL- 
1.Find the nth highest salary (without using LIMIT ).
2.Display departments having more than one manager.
 */
 
use dailytasks;
select *from emp order by sal desc;
select distinct sal from emp order by sal desc;

SELECT * FROM emp e WHERE (
    SELECT COUNT(distinct sal)
    FROM emp e2
    WHERE e2.sal > e.sal
) =4  -1;

 
select  deptno,count(distinct mgr)as 'manager count ',(select dname from dept where dept.deptno=e2.deptno) as dname from emp e2 where mgr is not null  group by deptno having count(distinct mgr) > 1;