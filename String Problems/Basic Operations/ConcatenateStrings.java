// Concatenate Strings: Input: 'hello', 'world' | Output: 'helloworld

import java.util.Scanner;
public class ConcatenateStrings {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter str1 name");
    String str1 = sc.next();
    System.out.println("Enter str2 name");
    String str2 = sc.next(); 
    System.out.println("String concatenation");
    String res = str1.concat(str2);
    System.out.println(res);
    
    }
}

