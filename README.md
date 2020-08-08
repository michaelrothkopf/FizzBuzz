# FizzBuzz

A simple program often used in tutorials.

## What does it do?

It prints numbers 0-100. However, if the number is a multiple of 3, it prints Fizz. If it's a multiple of 5, it prints Buzz.

## How does it work?

It uses a for loop.

#### Pseudocode:
For each number between one and one hundred:
	if the number is a multiple of 3, print Fizz.
	if the number is a multiple of 5, print Buzz.
	if it is neither (else), print the number.

## Okay, but how is that implemented?
For each number between one and one hundred:
is equivalent to
for(int i = 0; i <= 100, i++);

if the number is a multiple of 3
is implemented using the modulus operator.
The modulus operator divides two numbers and prints out the remainder.
To use the modulus, use the % symbol.
For example, 10 % 3 would return 1 because the remainder when you divide 10 / 3 is 1.
In this case, we use
if (i % 3 == 0) {
	System.out.println("Fizz"); // Prints to console
}
It is the same for 5, except we print Buzz and do i % 5.
if (i % 5 == 0) {
	System.out.println("Buzz"); // Prints to console
}
And if it's neither, it prints out i.
else {
	System.out.println(i); // Prints to console
}

This is licensed under the MIT License. You are free to use it for any purpose.