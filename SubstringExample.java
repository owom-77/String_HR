import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inputString = scanner.nextLine();
        
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        String result = inputString.substring(start, end);
        
        System.out.println(result);
        
        scanner.close();
    }
}
