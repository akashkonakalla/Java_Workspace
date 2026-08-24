SELECT deptno, MAX(sal)
FROM emp
GROUP BY deptno;

SELECT deptno, MAX(sal),AVG(sal)
FROM emp 
group by deptno;

SELECT ename,
       sal,
       AVG(sal) OVER () AS avg_salary
FROM emp;
