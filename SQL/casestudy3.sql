/*
1. Find employees who have the same job as scott but work in a different department.
2. Find employees who earn the same salary as another employee.
*/

use dailytasks;
select *from emp where job =(select job from emp where ename='scott') and deptno <> (select deptno from emp where ename='scott');
select *from emp 
where sal in (select sal from emp group by sal having count(sal)>1);