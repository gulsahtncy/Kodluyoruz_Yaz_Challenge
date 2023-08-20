package week9;

import java.util.Scanner;

public class Easy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir kelime girin: ");
		String kelime = scanner.nextLine();

		int uzunluk = kelime.length();

		System.out.println("Girilen kelimenin uzunluğu: " + uzunluk);

		scanner.close();
	}
}