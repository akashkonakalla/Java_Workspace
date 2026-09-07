use dailytasks;

delimiter //
create procedure getEmp(in dep int)
begin 
select * from emp where deptno = dep;
end
//

call getEmp(10);

delimiter $$
create  procedure getDept(in dep int) 
begin 
select *from dept where deptno=dep;

call getEmp(dep);

end
$$

call getdept(10);


drop procedure if exists getdept;

//Checking if we can create a procedure inside a procedure --- cannot create
/*
 Error Code: 1064. You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'delimiter$$
 CREATE PROCEDURE getDept(IN dep INT)
 BEGIN
  select * from emp where' at line 1	0.000 sec
*/

delimiter$$
CREATE PROCEDURE getDept(IN dep INT)
BEGIN

	select * from emp where deptno=dep;
    CREATE PROCEDURE getEmp(IN d INT)   
    BEGIN
        SELECT * FROM emp WHERE deptno = d;
    END;

END $$

/*
Can we create a function inside the procedure ?  cannot create a function inside a stored procedure.

	Error Code: 1303. Can't create a FUNCTION from within another stored routine	0.000 sec
*/

delimiter $$
create procedure new_Procedure_function (in dep int )
begin

create function getMaxSal( dep int)
returns int
begin 
select sal from emp where deptno =dep;
end;

end
$$

/*
Can we call a function inside a procesure ?

*/


delimiter $$
drop function if exists getAnnualSal;
create function getAnnualSal( salary int)
returns int
deterministic
begin 
return  salary*12;
end;
$$

select getAnnualSal(800);

DELIMITER $$
drop procedure if exists showempsalary;
CREATE PROCEDURE showEmpSalary()
BEGIN
    SELECT 
        empno,ename,sal,getAnnualSal(sal) AS annual_salary FROM emp;
END $$

call showEmpsalary();

