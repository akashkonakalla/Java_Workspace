/*
SQL- 
1.Find the nth highest salary (without using LIMIT ).
2.Display departments having more than one manager.
 */
 
 use dailytasks;
 
 select *from emp order by sal desc;
 select *from emp e where 1=(select count(sal) from emp e2 where e2.sal>e.sal );
select  distinct deptno from emp e2 where mgr is not null  group by deptno,mgr having count(*)>1;