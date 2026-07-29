/*

Mysql
1.Display the 3rd highest-paid employee.
2.Display the first 4 employees sorted by employee name.
*/

select *from emp order by sal desc,empno limit 2,1 ;
select *from emp order by ename limit 4 ;