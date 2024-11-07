import java.util.Scanner;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input = scan.nextLine();
        
        String[] tokens = input.split("[^A-Za-z]+");
        
        System.out.println(tokens.length);
        
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
        
        scan.close();
    }
}
