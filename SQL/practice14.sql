/*
Today's Assignment
Mysql:
1.Write a MySQL query to display employee name, job, salary, department name, and location
->for employees working in NEW YORK, DALLAS, or CHICAGO*.
->Salary must be between 1500 and 4000, and the job must be CLERK, SALESMAN, or ANALYST.
->Employee name must not end with S, 
->department number must not be 10, and salary must not be 1600 or 3000.
*/
use dailytasks;
select *from emp;
select ename, job,sal,dname,loc from emp e join dept d on e.deptno=d.deptno
where d.loc in ('new york','dallas','chicago')
and (e.sal between 1500 and 4000) 
and (e.job  in ('clerk','salesman','analyst'))
and (e.ename not like '%s')
and (e.deptno <> 10) 
and e.sal not in (1500,3000); 
