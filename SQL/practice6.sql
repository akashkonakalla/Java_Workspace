/*
Mysql
1.Display employees whose salary is greater than 2000 and department is 10 or 20.
2.Display employees whose job is not CLERK.
3.Display employees whose commission is NULL and salary is greater than 2500.
4.Display employees whose salary is between 1250 and 3000 but not equal to 3000.
5.Display employees who joined in the year 1981.
*/
set autocommit=0;

select *from emp where sal>2000 and (deptno = 10 or deptno=20);
savepoint sp1;

select * from emp where job != 'clerk';

savepoint sp2;
select *from emp where comm is null and sal >2500;

savepoint sp3;
select *from emp where sal between 1250 and 3000 and sal !=3000 ;

savepoint sp4;
select *from emp where hiredate between '1981-01-01' and '1981-12-31';