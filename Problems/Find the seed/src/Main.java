import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int minSeedValue = 0;
        int minRandomSeed = k;

        for (int i = a; i <= b; i++) {
            Random random = new Random(i);
            int maxRandomSeed = 0;
            int randomSeed;

            for (int j = 0; j < n; j++) {
                randomSeed = random.nextInt(k);
                maxRandomSeed = Math.max(maxRandomSeed, randomSeed);
            }

            if (maxRandomSeed < minRandomSeed) {
                minRandomSeed = maxRandomSeed;
                minSeedValue = i;
            }
        }
        System.out.println(minSeedValue);
        System.out.println(minRandomSeed);
    }
}