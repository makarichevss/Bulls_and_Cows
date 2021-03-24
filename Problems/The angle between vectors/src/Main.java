import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double angle = Math.atan2(x2, x1) - Math.atan2(y2, y1);
        System.out.println(Math.abs(Math.toDegrees(angle)));
    }
}