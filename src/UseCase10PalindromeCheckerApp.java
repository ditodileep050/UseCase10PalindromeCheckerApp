public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original input
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string
        // Remove spaces and special characters
        // Convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Step 2: Apply palindrome logic
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        // Step 3: Print result
        System.out.println("Input : " + input);
        System.out.println("Normalized : " + normalized);
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}