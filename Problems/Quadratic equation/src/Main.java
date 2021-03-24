import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(Math.min(x1, x2) + " " + Math.max(x1, x2));
        } else if (discriminant == 0) {
            double x = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println(x);
        }
    }
}