import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger m = scanner.nextBigInteger();
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        while (m.compareTo(a) > 0) {
            a = a.multiply(b);
            b = b.add(BigInteger.ONE);
        }
        System.out.println(b.subtract(BigInteger.ONE));
    }
}