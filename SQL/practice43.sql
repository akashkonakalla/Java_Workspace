DELIMITER $$

CREATE PROCEDURE high_salary_employees()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE emp_name VARCHAR(50);
    DECLARE emp_salary DECIMAL(10,2);

    DECLARE emp_cursor CURSOR FOR
        SELECT ename, salary
        FROM emp
        WHERE salary > 50000;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    OPEN emp_cursor;

    read_loop: LOOP

        FETCH emp_cursor INTO emp_name, emp_salary;

        IF done = 1 THEN
            LEAVE read_loop;
        END IF;

        SELECT emp_name AS Employee_Name,
               emp_salary AS Salary;

    END LOOP;

    CLOSE emp_cursor;
END $$

DELIMITER ;DELIMITER $$

CREATE PROCEDURE high_salary_employees()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE emp_name VARCHAR(50);
    DECLARE emp_salary DECIMAL(10,2);

    DECLARE emp_cursor CURSOR FOR
        SELECT ename, salary
        FROM emp
        WHERE salary > 50000;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    OPEN emp_cursor;

    read_loop: LOOP

        FETCH emp_cursor INTO emp_name, emp_salary;

        IF done = 1 THEN
            LEAVE read_loop;
        END IF;

        SELECT emp_name AS Employee_Name,
               emp_salary AS Salary;

    END LOOP;

    CLOSE emp_cursor;
END $$

DELIMITER ;