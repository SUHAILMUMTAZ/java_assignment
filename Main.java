import java.util.Scanner;

class Main { 
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int choice;

        do {
            // Display menu
            System.out.println("\nString Manipulation Menu:");
            System.out.println("1. Reverse String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Check if Palindrome");
            System.out.println("5. Count Vowels and Consonants");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) { // Handle invalid input
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to reverse: ");
                    input = scanner.nextLine();
                    System.out.println("Reversed String: " + reverseString(input));
                    break;

                case 2:
                    System.out.print("Enter a string to convert to uppercase: ");
                    input = scanner.nextLine();
                    System.out.println("Uppercase String: " + input.toUpperCase());
                    break;

                case 3:
                    System.out.print("Enter a string to convert to lowercase: ");
                    input = scanner.nextLine();
                    System.out.println("Lowercase String: " + input.toLowerCase());
                    break;

                case 4:
                    System.out.print("Enter a string to check if it is a palindrome: ");
                    input = scanner.nextLine();
                    if (isPalindrome(input)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;

                case 5:
                    System.out.print("Enter a string to count vowels and consonants: ");
                    input = scanner.nextLine();
                    int[] counts = countVowelsAndConsonants(input);
                    System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
                    break;

                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}