package week11;

public class Easy {
	public static void main(String[] args) {
		int toplamTop = 5 + 4 + 3; // Toplam top sayısı
		int ayniRenkOlasilik = 0;

		// İki topun aynı renkte olduğu durumlar:
		// 1. İki kırmızı top: 5C2 = 10 kombinasyon
		// 2. İki yeşil top: 4C2 = 6 kombinasyon
		// 3. İki mavi top: 3C2 = 3 kombinasyon
		ayniRenkOlasilik = 10 + 6 + 3;

		double olasilik = (double) ayniRenkOlasilik / (toplamTop * (toplamTop - 1) / 2);

		System.out.println("Aynı renkte top çekme olasılığı: " + olasilik);
	}
}
