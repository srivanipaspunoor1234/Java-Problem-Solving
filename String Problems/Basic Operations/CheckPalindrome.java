//  Check Palindrome: Input: 'radar' | Output: True
// using for loop

public class CheckPalindrome {
 public static void main(String[] args) throws Exception {
    String str ="radar";
    String temp =str;
    boolean isPalindrome=true;
    StringBuilder sb = new StringBuilder();
    for(int i=str.length()-1;i>=0;i--){
    sb.append(str.charAt(i));
    }
    if(sb.toString().equals(temp)){
    System.out.println(isPalindrome);
    }else{
        System.out.println(!isPalindrome);
    }
    }
}


//  another method 

// public class Strings {
//     public static void main(String[] args) throws Exception {
//     String str ="radar";
//     StringBuilder sb = new StringBuilder(str);
//     boolean isPalindrome = str.equals( sb.reverse().toString());
//     System.out.println(isPalindrome);
//     }
// }
