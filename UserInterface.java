import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dictionary dictionary;
    private Scanner scanner;

    public UserInterface(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word: ");
            String input = scanner.nextLine().toLowerCase();

            if (!dictionary.getMeaning(input).equals("Meaning not found")) {

                System.out.println("Meaning: " + dictionary.getMeaning(input));
            } else {
                List<String> suggestions = dictionary.suggestCorrections(input);
                if (!suggestions.isEmpty()) {
                    System.out.print("Did you mean ");
                    for (String suggestion : suggestions) {
                        System.out.print(suggestion + ", ");
                    }
                    System.out.println("?");
                } else {
                    System.out.println("Word not found in dictionary.");
                }
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String continueInput = scanner.nextLine().toLowerCase();
            if (!continueInput.equals("yes")) {
                break;
            }
        }
        scanner.close();
    }
}