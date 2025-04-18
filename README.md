
# Java Program: Check if a Number is Negative or Even

## Description

This Java program checks whether an input number is either **negative** or **even**. If the condition is satisfied, the program prints the **last digit** of the number. Otherwise, it displays a message stating that the number is **not negative or even**.

## Features

- Accepts user input from the console.
- Evaluates whether the number is negative or even.
- Displays the last digit if the condition is met.
- Handles both positive and negative integers.

## Code

```java
package test_27_03_25;

import java.util.Scanner;

public class NumIsNegativeOrEven 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);  // Create Scanner object for input
        System.out.println("Enter the Number");  // Prompt user for input
        int num = s.nextInt();  // Read integer input from user
        
        // Check if the number is negative OR even
        if(num < 0 || num % 2 == 0)
            System.out.println(num % 10);  // Print the last digit of the number
        else
            System.out.println(num + " is Not Negative Or Even");  // Message if condition fails
    }
}
```

## How It Works

1. The program starts by importing the `Scanner` class to handle user input.
2. It prompts the user to enter an integer.
3. The input is stored in the variable `num`.
4. The condition `num < 0 || num % 2 == 0` checks whether the number is:
   - Less than 0 (negative), OR
   - Divisible by 2 (even).
5. If either condition is `true`, it prints `num % 10`, which gives the last digit of the number.
6. If neither condition is true (i.e., the number is positive and odd), it prints a message indicating that the number is not negative or even.

## Example Outputs

```
Input: -45
Output: 5

Input: 24
Output: 4

Input: 7
Output: 7 is Not Negative Or Even
```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Number_Is_Negative_Or_Even.git
```
