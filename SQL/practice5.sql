/*
Mysql
1.Display employees who do not receive commission.
2.Display employees hired before 01-JAN-1981.
*/
use dailytasks;
set autocommit=0;
select *from emp where comm is null;
savepoint sp1;
select ename from emp where hiredate < '1981-01-01' ;

SELECT *
FROM emp
WHERE hiredate <= ('1980-12-17');
/*
1.Display departments whose department name contains 'E'.
2.Display employees whose name ends with 'TH'.
*/
select dname from dept where dname like '%e%';
select *from emp where ename like "%th";

SELECT *
FROM emp
WHERE hiredate < '1983-12-07';

select distinct * from emp;
SELECT deptno
FROM emp
GROUP BY deptno;

select  sal from emp ;
select  count(*) from emp ;
