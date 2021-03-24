import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] stats = input.split("[=&?]");
        String existsPass = "";

        for (int i = 1; i < stats.length - 1; i += 2) {
            if (existsPass.length() == 0) {
                existsPass = printValue(stats[i], stats[i + 1]);
            } else {
                printValue(stats[i], stats[i + 1]);
            }
        }

        if (existsPass.length() > 0) {
            printValue("password", existsPass);
        }
    }

    private static String printValue(String key, String value) {
        if (value.length() == 0) {
            System.out.println(key + " : " + "not found");
        } else {
            System.out.println(key + " : " + value);
            if (key.compareTo("pass") == 0) {
                return value;
            }
        }
        return "";
    }
}