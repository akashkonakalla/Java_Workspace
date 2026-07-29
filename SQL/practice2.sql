/*
Mysql
1.Display the top 3 employees with the highest commission.
2.Display the 4th and 5th highest-paid employees
*/

DROP TABLE emp;
CREATE TABLE dept (

deptno int not NULL,

dname varchar(20) not NULL,

loc varchar(20) not NULL,

primary key(deptno)

);

CREATE TABLE emp (

empno int NOT NULL,

ename varchar(10) not NULL,

job varchar(15) not NULL,

mgr int default NULL,

hiredate date not NULL,

sal int not NULL,

comm int default NULL,

deptno int not NULL,

primary key(empno),

foreign key(deptno)

references dept(deptno)

);

INSERT INTO dept VALUES (10,'ACCOUNTING','NEW YORK');

INSERT INTO dept VALUES (20,'RESEARCH','DALLAS');

INSERT INTO dept VALUES (30,'SALES','CHICAGO');

INSERT INTO dept VALUES (40,'OPERATIONS','BOSTON');


INSERT INTO emp VALUES (7369,'SMITH','CLERK','7902','1980-12-17',800.00,NULL,20);

INSERT INTO emp VALUES (7499,'ALLEN','SALESMAN','7698','1981-02-20',1600.00,300.00,30);

INSERT INTO emp VALUES (7521,'WARD','SALESMAN','7698','1981-02-22',1250.00,500.00,30);

INSERT INTO emp VALUES (7566,'JONES','MANAGER','7839','1981-04-02',2975.00,NULL,20);

INSERT INTO emp VALUES (7654,'MARTIN','SALESMAN','7698','1981-02-28',1250.00,1400.00,30);

INSERT INTO emp VALUES (7698,'BLAKE','MANAGER','7839','1981-05-01',2850.00,NULL,30);

INSERT INTO emp VALUES (7782,'CLARK','MANAGER','7839','1981-06-09',2450.00,NULL,10);

INSERT INTO emp VALUES (7788,'SCOTT','ANALYST','7566','1982-12-09',3000.00,NULL,20);

INSERT INTO emp VALUES (7839,'KING','PRESIDENT',NULL,'1981-11-17',5000.00,NULL,10);

INSERT INTO emp VALUES (7844,'TURNER','SALESMAN','7698','1981-09-08',1500.00,0.00,30);

INSERT INTO emp VALUES (7876,'ADAMS','CLERK','7788','1983-01-12',1100.00,NULL,20);

INSERT INTO emp VALUES (7900,'JAMES','CLERK','7698','1981-12-03',950.00,NULL,30);

INSERT INTO emp VALUES (7902,'FORD','ANALYST','7566','1981-12-03',3000.00,NULL,20);

INSERT INTO emp VALUES (7934,'MILLER','CLERK','7782','1982-01-23',1300.00,NULL,10);


select *from emp;


-- 1.Display the top 3 employees with the highest commission.
select *from emp order by comm desc limit 3;

-- 2.Display the 4th and 5th highest-paid employees 
select *from emp order by sal desc limit 3,2;