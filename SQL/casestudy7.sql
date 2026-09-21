/*
SQL Case Study - 7

We need:
Employee Name
Job Title
Department Name
Department Location
Manager Name
Employee Experience
Manager Experience
Exclude employees without managers
Sort by Department Name and Employee Name

*/

select e.ename as 'employee name ',
e.job as "job title",
d.dname as "department name",
d.loc as "department location",
m.ename as "manager name",
timestampdiff(year,e.hiredate,curdate()) as "employee experience",
timestampdiff(year,m.hiredate,curdate()) as "manager experience"

from emp e
join dept d 
on e.deptno = d.deptno
join  emp m
on e.mgr=m.empno
order by d.dname,
e.ename;