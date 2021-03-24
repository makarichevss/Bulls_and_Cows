import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int vowelsCount = 0;
        int consonantsCount = 0;
        int addLettersCount = 0;

        for (int i = 0; i < word.length(); i++) {
            switch (word.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    consonantsCount = 0;
                    vowelsCount++;
                    break;
                default:
                    consonantsCount++;
                    vowelsCount = 0;
                    break;
            }
            if (vowelsCount > 2) {
                addLettersCount++;
                vowelsCount = 1;
                consonantsCount = 0;
            }
            if (consonantsCount > 2) {
                addLettersCount++;
                vowelsCount = 0;
                consonantsCount = 1;
            }
            System.out.println();
        }
        System.out.println(addLettersCount);
    }
}