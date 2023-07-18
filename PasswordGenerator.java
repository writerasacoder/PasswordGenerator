import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        scanner.close();

        // Generate the password
        String password = generatePassword(name, address, phone);

        // Print the generated password
        System.out.println("Generated password: " + password);
    }

    public static String generatePassword(String name, String address, String phone) {
        // Extract first letter of the name
        char firstLetter = name.charAt(0);

        // Extract first two letters of the address
        String firstTwoLetters = address.substring(0, Math.min(address.length(), 2));

        // Extract last four digits of the phone number
        String lastFourDigits = phone.substring(Math.max(phone.length() - 4, 0));

        // Generate a random special character
        char specialChar = getRandomSpecialChar();

        // Combine the extracted information and special character to form the password
        return String.valueOf(firstLetter) + firstTwoLetters + specialChar + lastFourDigits;
    }

    public static char getRandomSpecialChar() {
        // Define the set of special characters
        String specialChars = "@#$%&";

        // Generate a random index within the range of specialChars
        int randomIndex = (int) (Math.random() * specialChars.length());

        // Return the randomly chosen special character
        return specialChars.charAt(randomIndex);
    }
}
