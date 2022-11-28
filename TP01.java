import java.util.Scanner;
public class TP01 {
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int N2 = in.nextInt();
            int result = (900 / N );

            if (60 <= N2 || N2 <= 10000000) {
                int result2 = (N2%100 * 13 - 3);
                do {
                    System.out.println(result);
                    System.out.println(result2);
                    N++;
                    break;
                }
                while (N != 10000000);
            }
        }
    }
}

