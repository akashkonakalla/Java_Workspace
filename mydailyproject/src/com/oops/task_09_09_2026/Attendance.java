package com.oops.task_09_09_2026;
/*
*Today's Assignment*
Java-
1.A company records attendance for different employees.
Create an interface Attendance with method markAttendance().
Implement Developer, Tester, and Manager.
Display attendance messages with employee roles.

PL/SQL-
1. Create an *AFTER UPDATE* trigger on the employee table.
whenever an employee's salary is updated, automatically insert the employee number, old salary, and new salary into *salary_audit table*.
2.Create an explicit cursor to fetch employees whose salary is greater than 50000.
Display employee number, name, and salary.
*/

public interface Attendance  {
	void markAttendance();

}
