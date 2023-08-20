package week8;

import java.util.Scanner;

public class Easy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı girin: ");
		double sayi = scanner.nextDouble();

		double kare = sayi * sayi;

		System.out.println(sayi + " sayısının karesi: " + kare);

		scanner.close();

	}
}