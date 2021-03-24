import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char x = input.charAt(0);
        int counter = 0;

        for (int i = 0; i < input.length(); i++) {
            if (x == input.charAt(i)) {
                counter++;
            } else {
                System.out.printf("%s%s", x, counter);
                counter = 1;
                x = input.charAt(i);
            }
        }
        System.out.printf("%s%s", x, counter);
    }
}