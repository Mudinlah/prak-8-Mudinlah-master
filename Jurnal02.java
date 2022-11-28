import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		double beli = input.nextInt();
		System.out.printf("%.2f" , jumlah(beli, input));
	}
	private static double jumlah(double beli, Scanner input){
		double awal = 0;
		double total = 0;
		while (beli != 0){
			awal = awal + beli;
			beli = input.nextInt();
			total++;
		}
		return awal / total;
	}
}
