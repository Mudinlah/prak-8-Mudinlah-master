import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int bil = input.nextInt();
		int awal = 1;
		if (bil >= 100){

			int kiri = bil / 100;
			int tengah = bil % 100 / 10;
			int kanan = bil % 10;
			int awal1 = 1;
			while (kiri >= 1){
				awal1 = awal1 * kiri;
				kiri--;
			}
			int awal2 = 1;
			while (tengah >= 1){
				awal2 = awal2 * tengah;
				tengah--;
			}
			int awal3 = 1;
			while (kanan >= 1){
				awal3 = awal3 * kanan;
				kanan--;
			}
			if (awal1 + awal2 + awal3 == bil){
				System.out.println("YA");
			} else{
				System.out.println("BUKAN");
			}
		} else if (bil < 10){
			int angka = bil;
			while (angka >= 1){
				awal = awal * angka;
				angka--;
			}
			if (awal == bil){
				System.out.println("YA");
			} else{
				System.out.println("BUKAN");
			}
		}
	}
}
