import java.util.Scanner;
public class t2056 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int sum = 0;

            for (int i = 0; i < n; i++) {
                int t = scanner.nextInt();

                sum += t;

                if (t == 3) {
                    System.out.println("«None»");
                    return;
                }
            }

            if (sum == n * 5) {
                System.out.println("«Named»");
            } else if ((double) sum / n >= 4.5) {
                System.out.println("«High»");
            } else {
                System.out.println("«Common»");
            }

            scanner.close();
        }
    }

