/*
Case Study 2

Query 1: Employees Earning Below Average 
Query 2: Employees Earning the Second Highest Salary 
Query 3: Employees Earning the Third Highest Salary 
*/

select ename from emp having sal<(select avg(sal) from emp);

-- only 1 highest second employee 
select *from emp  order by sal desc limit 1,1 ;
-- All employees with 2nd highest salary
select *from emp where sal=(select distinct sal from emp order by sal desc limit 1,1); 
-- All employees with 3rd highest salary
select *from emp where sal=(select distinct sal from emp order by sal desc limit 2,1); 


