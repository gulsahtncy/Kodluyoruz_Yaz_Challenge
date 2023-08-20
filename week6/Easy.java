package week6;

import java.util.Scanner;

public class Easy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Birinci sayıyı girin: ");
		int sayi1 = scanner.nextInt();

		System.out.print("İkinci sayıyı girin: ");
		int sayi2 = scanner.nextInt();

		int toplam = sayi1 + sayi2;

		System.out.println("Girilen sayıların toplamı: " + toplam);

		scanner.close();
	}
}
