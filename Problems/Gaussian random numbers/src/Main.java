import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();

        do {
            Random random = new Random(k);
            for (int i = 0; i < n; i++) {
                if (random.nextGaussian() > m) {
                    k++;
                    break;
                } else if (i == n - 1) {
                    System.out.println(k);
                    return;
                }
            }
        } while (true);
    }
}