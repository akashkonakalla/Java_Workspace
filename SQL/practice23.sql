use dailytasks;

select *from emp where job =(select job from emp where ename='scott') and deptno != (select deptno from emp where ename='scott') LIMIT 0, 1000;


 set autocommit=0;
 select *from books;
 drop table books;
 truncate books;
 rollback;
 
 CREATE TABLE salgrade (

grade int,

losal int,

hisal int

);

use dailytasks;
select *from emp
union all
select *from emp;
select count(*);
select count(null);
select count(5-0);
select count(sum(1));
select sum(-1);
select sum(null);

select avg(0);
select avg(null);

select min(null);

select *from emp, dept;

INSERT INTO salgrade VALUES (1, 700, 1200);

INSERT INTO salgrade VALUES (2, 1201, 1400);

INSERT INTO salgrade VALUES (3, 1401, 2000);

INSERT INTO salgrade VALUES (4, 2001, 3000);

INSERT INTO salgrade VALUES (5, 3001, 9999);

COMMIT;