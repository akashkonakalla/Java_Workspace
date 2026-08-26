SELECT employee_name,department,salary,
AVG(salary) OVER(PARTITION BY department) AS dept_avg_salary
FROM employees;
