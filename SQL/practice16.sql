/*
SQL -
1. All employees with their department details, and Departments that currently have no employees.
 */
 use dailytasks;
 (select *from emp as e left outer join dept as d on e.deptno =d.deptno)
 union 
 (select *from emp d right outer join dept e on e.deptno=d.deptno) ;