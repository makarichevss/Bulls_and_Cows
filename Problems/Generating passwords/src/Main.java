import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperA = scanner.nextInt();
        int lowerB = scanner.nextInt();
        int digitC = scanner.nextInt();
        int lengthN = scanner.nextInt();


        for (int i = 0; i < upperA; i++) {
            if (i % 2 == 0) {
                System.out.print("A");
            } else {
                System.out.print("B");
            }
        }

        for (int i = 0; i < lowerB; i++) {
            if (i % 2 == 0) {
                System.out.print("a");
            } else {
                System.out.print("b");
            }
        }

        for (int i = 0; i < digitC; i++) {
            if (i % 2 == 0) {
                System.out.print("1");
            } else {
                System.out.print("2");
            }
        }

        for (int i = 0; i < lengthN - upperA - lowerB - digitC; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("!");
            }
        }
    }
}