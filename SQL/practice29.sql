/*
*Today's Assignment*

Sql- 31/08/2026
1.Using a CTE, find the total salary of each department and display departments whose total salary is greater than 5000.
2. Using a CTE, find the employees who have the second-lowest salary in their respective departments.
*/

use dailytasks;
WITH TOTSAL AS (
SELECT *,SUM(SAL) OVER(PARTITION BY DEPTNO) AS TOTAL_SAL_DEPT FROM EMP
)
SELECT DISTINCT DEPTNO,TOTAL_SAL_DEPT FROM TOTSAL WHERE TOTAL_SAL_DEPT > 5000;

WITH RES1 AS (
SELECT DEPTNO,SUM(SAL) AS TOTAL FROM EMP GROUP BY DEPTNO HAVING TOTAL>5000
)
SELECT *FROM RES1;

WITH LOW AS (
SELECT *, DENSE_RANK() OVER( PARTITION BY DEPTNO ORDER BY SAL ASC) AS LOWSAL FROM EMP
)
SELECT *FROM LOW WHERE LOWSAL=2;