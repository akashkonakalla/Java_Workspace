package com.exception.task_29_09_2026;

public class InvalidAgeException extends Exception {

	InvalidAgeException(String msg) {
		super(msg);
		System.out.println("Age invalid exception");

	}
}
