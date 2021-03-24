import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase();
        int gC = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'g' || sentence.charAt(i) == 'c') {
                gC++;
            }
        }
        System.out.println((double) gC / sentence.length() * 100);
    }
}