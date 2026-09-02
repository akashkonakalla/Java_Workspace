/*
Sql-
1. Find employees whose salary is greater than the average salary of their department, 
   but less than the maximum salary of their department, and whose manager earns less than the employee's salary.
 */
 
 use dailytasks;

select *from (
 
 select e1.*,avg(e1.sal) over (partition by e1.deptno) as avgsal,max(e1.sal) over(partition by e1.deptno) as maxsal,e2.sal as mgrsal from emp e1 join emp e2 on e1.mgr =e2.empno
 
 )as temp where sal>avgsal && sal<maxsal && sal>mgrsal;
 
 
 
 