import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int length = text.length();
        if (length % 2 == 0) {
            evenText(text, length);
        } else {
            oddText(text, length);
        }
    }

    private static void evenText(String text, int length) {
        int stop = length / 2 - 1;
        int start = length / 2 + 1;
        System.out.println(text.substring(0, stop) + text.substring(start));
    }

    private static void oddText(String text, int length) {
        int stop = length / 2;
        int start = length / 2 + 1;
        System.out.println(text.substring(0, stop) + text.substring(start));
    }
}