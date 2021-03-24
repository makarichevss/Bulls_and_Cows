import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        StringBuilder textReverse = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            textReverse.append(text.charAt(i));
        }
        if (text.equals(textReverse.toString())){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}