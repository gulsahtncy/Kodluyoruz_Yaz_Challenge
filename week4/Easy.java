package week4;

public class Easy {
	public static void main(String[] args) {
		int[] dizi = { 12, 45, 67, 23, 9, 56, 89, 34, 72, 5 };

		int enBuyuk = dizi[0]; // Dizinin ilk elemanını en büyük olarak varsayalım

		for (int i = 1; i < dizi.length; i++) {
			if (dizi[i] > enBuyuk) {
				enBuyuk = dizi[i]; // Eğer dizi[i] enBuyuk'tan büyükse, enBuyuk'u güncelle
			}
		}
		System.out.println("En büyük sayı: " + enBuyuk);
	}
}
