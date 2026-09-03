/*
*Today's Assignment*
Sql-
1.Write a stored procedure that accepts empno and salary increment percentage as IN parameters. The procedure should calculate the revised salary by applying the given percentage increase the employee's existing salary and display the employee name, original salary, and revised salary.
*/
use dailytasks;
delimiter $$
drop procedure if exists sal_increment $$
CREATE   PROCEDURE `sal_increment` (in eNO int , in dis int)
BEGIN
select *,ROUND(((dis/100)*sal + sal),2) as Sal_Increment from emp where empno=eNO;
END
$$

call sal_increment(7839,10);