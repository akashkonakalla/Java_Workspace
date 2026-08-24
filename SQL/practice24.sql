/*
SQL-
1.Create a view to display employee name and salary.
2.Create a view that displays employees working in department 10.
*/

use dailytasks;
create view NameSal as (select ename, sal from emp);
select *from namesal;

create view empDep10 as select *from emp where deptno=10;
select *from empdep10;