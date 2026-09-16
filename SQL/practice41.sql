/*

PL/SQL-
1.Create an explicit cursor to fetch employees with salary greater than 50000.
Fetch one record at a time.
Display employee name and salary.

*/

delimiter $$
drop procedure if exists fetch_sal; $$
create procedure fetch_sal()
begin
declare finished int default 0;
declare empname varchar(40);
declare empsal int;

declare getnamesal cursor for
select ename, sal from emp where sal>50000;

declare continue handler for not found set finished =1;

open getnamesal;

label : loop

fetch getnamesal into empname,empsal;

if finished =1 then
   leave label;
end if;

select empname, empsal;
end loop ;

close getnamesal;
end
$$

call fetch_sal();