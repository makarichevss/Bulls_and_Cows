import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(alphabet.contains(word));
    }
}