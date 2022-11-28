import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String masukan = input.nextLine();
            String nomora[] = masukan.split("\\s+");
            int jumlah = 0;
            while (masukan.endsWith("0")) {
                for (String nomor : nomora) {
                    Integer n = Integer.parseInt(nomor);
                    jumlah += n;
                    masukan = String.valueOf(masukan.endsWith(""));
                }
                System.out.println(jumlah);
            }
        }
    }
}