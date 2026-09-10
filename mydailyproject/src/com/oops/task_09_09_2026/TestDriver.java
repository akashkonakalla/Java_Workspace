package com.oops.task_09_09_2026;

public class TestDriver {
	public static void main(String[] args) {
		Attendance a1=new Developer();
		a1.markAttendance();
		Attendance a2=new Tester();
		a2.markAttendance();
		Attendance a3=new Manager();
		a3.markAttendance();
	}
}
