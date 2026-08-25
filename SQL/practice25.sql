/*
Sql- 
1.Assign dense ranks to employees based on their commission in descending order.
2.Using DENSE_RANK(), display employees whose Dense Rank = 2 within each department.
*/

use dailytasks;
select *,dense_rank() over(order by comm desc) as denserank from emp;

-- dense rank order by empno and partition by deptno
select * from (select *,dense_rank() over(partition by deptno order by empno)as denserank from emp) as tab where denserank=2;
-- dense rank partition by deptno, without order by
select * from (select *,dense_rank() over(partition by deptno )as denserank from emp) as tab where denserank=2;
-- dense rank partition by deptno, order by sal
select * from (select *,dense_rank() over(partition by deptno order by sal )as denserank from emp) as tab where denserank=2;

select *, dense_rank()over(order by sal) from emp;