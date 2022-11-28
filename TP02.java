import java.util.Scanner;
public class TP02 {
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        try (Scanner in = new Scanner(System.in)) {
            int N, N2 = 0;
            Scanner input = new Scanner(System.in);
            N = input.nextInt();

            while(N != 0 ) {
                N2 = N2 * 10;
                N2 = N2 + N%10;
                N = N/10;
            }
            System.out.println(N2);

        }
    }
}



