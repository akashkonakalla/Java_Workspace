/*

*Today’s Assignment*:-

*Java: -*
1.Create an ATM program with separate try-catch blocks for:
Withdraw amount → handle ArithmeticException
Convert entered amount from String to double → handle NumberFormatException
Access transaction history using an array → handle ArrayIndexOutOfBoundsException
Display account details → handle possible NullPointerException
Requirement: If one operation fails, the remaining operations should continue.

SQL-
1. Write an SQL Query to Display the Managers (mgr) and Number of Employees Working Under Them.

*/
SELECT distinct mgr,count(mgr) over(partition by mgr) as 'Employees count' from emp  WHERE MGR IS NOT NULL;

select DISTINCT MGR from emp WHERE MGR IS NOT NULL;

SELECT * FROM EMP;


