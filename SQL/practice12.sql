/*
*Today's task* 
 *MySQL* 
1. Display employees working in departments located in DALLAS?
2. Display employees whose salary is higher than at least one MANAGER?
3. Display employees who are not assigned to the department with the lowest employee count?
*/

select *from emp where deptno in (select deptno from dept where loc like 'dallas');
select *from emp where sal>(select min(sal) from emp where job= 'manager');
select *from emp where deptno not in (select deptno from (select deptno,count(deptno) from emp group by deptno) count having min(deptno));