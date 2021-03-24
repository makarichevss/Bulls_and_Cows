import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String fragment = scan.nextLine();

        String[] arr = text.split(fragment, -1);
        System.out.println(arr.length - 1);
    }
}