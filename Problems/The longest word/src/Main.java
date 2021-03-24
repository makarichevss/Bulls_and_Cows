import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        String longestWord = text[0];

        for (String word : text) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
    }
}