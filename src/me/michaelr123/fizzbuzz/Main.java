package me.michaelr123.fizzbuzz;

public class Main {
	
	static boolean isMultipleOf3(int number) {
		if (number % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean isMultipleOf5(int number) {
		if (number % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("FizzBuzz\nPrints numbers from 0 to 100.\nIf the number is a multiple of 3, prints Fizz instead of the number.\nIf the number is a multiple of 5, prints buzz instead of the number.\nOtherwise, it prints the number.\nLet's begin!\n");
		
		for (int i = 0; i <= 100; i++) {
			if (isMultipleOf3(i)) {
				System.out.println("Fizz");
			} else if (isMultipleOf5(i)) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
}
