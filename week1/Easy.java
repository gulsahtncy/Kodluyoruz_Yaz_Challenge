package week1;

import java.util.Scanner;

public class Easy {
	public static void main(String[] args) {

		int thisYear, year, age;
		thisYear = 2023;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your date of birth : ");
		year = input.nextInt();

		age = thisYear - year;
		System.out.print("Your age : " + age);
	}
}
