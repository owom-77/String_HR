import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        if (isPalindrome(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String s) {
        int length = s.length();

        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
