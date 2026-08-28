/*

*Sql*-
1. Display employees whose salary is lower than the salary of the next employee in their department.

2.Display the employees whose salary is greater than the previous employee's salary but less than the next employee's salary, based on hire date asc within the department.
 */
 
 use dailytasks;
 
 with res1 as (
 select *,lead(sal,1) over(partition by deptno) as tem from emp
 )
 select *from res1 where sal<tem;
 
 select *,lag(sal,1) over(partition by deptno order by hiredate desc) as down from emp;
 select deptno,hiredate from emp group by deptno,hiredate order by deptno;
 
 with res2 as(
 select *,lag(sal,1) over(partition by deptno order by hiredate asc) as up, lead(sal,1) over(partition by deptno order by hiredate asc) as down from emp
 )
 select *from res2 where sal>up and sal<down;