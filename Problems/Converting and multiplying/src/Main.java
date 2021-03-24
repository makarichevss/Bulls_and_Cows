import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            try {
                int number = Integer.parseInt(line);
                if (number == 0) {
                    break;
                }
                System.out.println(number * 10);
            } catch (Exception e) {
                System.out.printf("Invalid user input: %s\n", line);
            }
        }
    }
}