package sa;

import java.util.Scanner;

public class ucus {

	public static void main(String[] args) {

		int km, yas, tip;
		double tutar, topTutar, indTutar, indYas, indGidisDonus;

		Scanner input = new Scanner(System.in);
		System.out.println("------------------------");
		System.out.print("Mesafeyi KM Türünden Giriniz :");
		km = input.nextInt();
		System.out.print("Yaşınızı Giriniz :");
		yas = input.nextInt();
		System.out.print("Yolculuk Tipini Giriniz (1 Veya 2) :");
		tip = input.nextInt();

		if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
			tutar = km * 0.10;

			if (yas < 12) {

				indYas = tutar * 0.50;

				indTutar = tutar - indYas;
				indGidisDonus = tip == 2 ? indTutar * 0.20 : 0;
				topTutar = (indTutar - indGidisDonus) * tip;
				System.out.println(" Toplam Tutar :" + topTutar);

			} else if (yas < 24) {

				indYas = tutar * 0.10;
				indTutar = tutar - indYas;
				indGidisDonus = tip == 2 ? indTutar * 0.20 : 0;
				topTutar = (indTutar - indGidisDonus) * tip;
				System.out.println("Toplam Tutar :" + topTutar);
			} else if (yas < 65) {

				indYas = tutar * 0.30;
				indTutar = indYas - tutar;
				indGidisDonus = tip == 2 ? indTutar * 0.20 : 0;
				topTutar = (indGidisDonus - indTutar) * tip;
				System.out.println("Toplam Tutar : " + topTutar);
			} else {
				indYas = tutar * 0.30;
				indTutar = indYas - tutar;
				indGidisDonus = tip == 2 ? indTutar * 0.20 : 0;
				topTutar = (indGidisDonus - indTutar) * tip;
				System.out.println("Toplam Tutar : " + topTutar);
			}

		} else {
			System.out.println("Hatalı Veri Girdiniz");
		}

	}

}
