/*
Mysql
1.Display all distinct manager IDs.
2.Display all distinct commission values.
3.Display all distinct combinations of job and department number.
*/

select distinct mgr from emp ;

select distinct comm from emp;

select distinct job,deptno from emp;

-- clerk or manager

select *from emp where job = 'clerk' or job='manager' or deptno=10 order by sal desc;

select *from emp where sal>1500 and comm>500;