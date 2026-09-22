/*
MySQL
1. Show departments where total salary expenditure is greater than 10000.
PLSQL
1. Create function to return optimized bonus percentage
Logic:
Salary < 2000 → 20%
Salary 2000–5000 → 10%
Salary > 5000 → 5%

*/

use gut;

select * from (select distinct d.deptno, d.dname, sum(e.sal) over(partition by e.deptno order by e.deptno asc) as "Expenditure" from emp e join dept d on d.deptno = e.deptno) temp where expenditure > 10000;

select distinct d.deptno, d.dname, sum(sal)as "Expenditure" from emp e join dept d on d.deptno = e.deptno group by d.deptno, d.dname having sum(sal) > 10000;


-- 2 

delimiter $$
drop function if exists bonus $$
create function bonus(salary int)
returns varchar(40)
deterministic
begin 

  DECLARE sal_new VARCHAR(40);
select '20%' into sal_new where Salary < 2000;
select '10%' into sal_new where salary between 2000 and 5000;
select '5%' into sal_new where salary > 5000;

return sal_new;
end
$$

delimiter $$
drop function if exists bonus $$

create function bonus(salary int)
returns varchar(40)
deterministic
begin
if salary < 2000 then
return '20%';
elseif salary between 2000 and 5000 then
return '10%';
else return '5%' ;
end if;
end
$$

select bonus(10000);