package week2;

import java.util.Scanner;

public class Easy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı girin: ");
		int sayi = scanner.nextInt();

		boolean asalMi = true;

		if (sayi <= 1) {
			asalMi = false;
		} else {
			for (int i = 2; i <= Math.sqrt(sayi); i++) {
				if (sayi % i == 0) {
					asalMi = false;
					break;
				}
			}
		}

		if (asalMi) {
			System.out.println(sayi + " sayısı asaldır.");
		} else {
			System.out.println(sayi + " sayısı asal değildir.");
		}

		scanner.close();
	}
}
