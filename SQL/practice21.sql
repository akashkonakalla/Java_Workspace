/*
SQL-
1.Display the employees who have the second-highest salary in their respective jobs, along with their name and salary.
2.Display the employees who have the second-highest salary grade in their respective departments, along with their name and grade.
*/
use dailytasks;

select *from emp;
select e.ename ,e.sal from emp e where (select count(distinct e2.sal) from emp e2 where e2.job=e.job and e2.sal>e.sal)= 2-1;
select ename, sal , job from (select ename,job,sal, dense_rank() over ( partition by job order by sal desc) as count from emp )as temp where count=2;

select e.ename ,e.sal,s.grade from emp e inner join salgrade s on e.sal between s.losal and s.hisal where (select count(distinct e2.sal) from emp e2  where e2.job=e.job and e2.sal>e.sal)= 2-1 ;
select ename,sal ,job,s.grade from (select ename, job , sal , dense_rank() over (partition by job order by sal desc) as count from emp ) as temp inner join salgrade s on temp.sal between s.losal and s.hisal where count =2;