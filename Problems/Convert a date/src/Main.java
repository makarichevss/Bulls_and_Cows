import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] dateParts = date.split("-");
        System.out.printf("%s/%s/%s", dateParts[1], dateParts[2], dateParts[0]);
    }
}