/*
MYSQL:
1.Display employee name, manager name, employee salary, manager salary, and salary grade of the employee.

2.Display employees who have a higher salary grade than their manager, showing employee name, manager name, employee grade, and manager grade.

 */
 
 set autocommit=0;
 select *from emp;
 select *from salgrade;
 
 select e1.ename, e2.ename as 'Manager name', e1.sal as 'Employee_salary', e2.sal as 'Manager_salary', s.grade as 'Employee grade' , s1.grade as 'Manager grade'from emp e1 join emp e2 on e1.mgr=e2.empno 
 inner join salgrade as s on e1.sal between s.losal and s.hisal
inner join salgrade as s1 on e2.sal between s1.losal and s1.hisal;
 
select e1.ename as 'Employee name',s1.grade as 'Employee grade', m.ename as 'Manager name', s2.grade as 'Manager grade' from emp e1  join emp m on e1.mgr=m.empno inner join salgrade s1 on e1.sal between s1.losal and s1.hisal
inner join salgrade s2 on m.sal between s2.losal and s2.hisal where s1.grade>s2.grade; 
 
 select * from emp e1  join emp m on e1.mgr=m.empno inner join salgrade s1 on e1.sal between s1.losal and s1.hisal
inner join salgrade s2 on m.sal between s2.losal and s2.hisal where s1.grade>s2.grade; 
