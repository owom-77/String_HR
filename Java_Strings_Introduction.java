import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
    
        int sumOfLength = A.length() + B.length();
        System.out.println(sumOfLength);
        
        String res = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(res);
        
        String capitalizedA = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String capitalizedB = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
        
    }
}