package test_27_03_25;

import java.util.Scanner;

public class NumIsNegativeOrEven 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		if(num<0 || num%2==0)
			System.out.println(num%10);
		else
			System.out.println(num + " is Not Negative Or Even");
	}
}
