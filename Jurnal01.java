import java.util.Scanner;
public class Jurnal01 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		double massa = input.nextInt();
		double hariAkhir = input.nextInt();
		System.out.printf("%.3f", zatRadioaktif(massa, hariAkhir));
	}
	private static double zatRadioaktif(double massa, double hariAkhir){
		int hariAwal = 0;
		while (hariAwal < hariAkhir){
			massa /= 2;
			hariAwal += 10;
		}
		return massa;
	}
}
