// Reverse a String: Input: 'hello' | Output: 'olleh    
// reversing a string by swapping 

import java.util.Arrays;
public class ReverseString{
    public static void main(String[] args) throws Exception {
     String str = "hello";
     char[] charArray =str.toCharArray();
     System.out.println(Arrays.toString(charArray));
     int left =  0;
     int right = charArray.length -1;
     while(left<right){
     char temp =charArray[left];
     charArray[left] = charArray[right];
     charArray[right] = temp;
     left++;
     right--;
    }
     System.out.println(charArray);
}
}

// Reverse a String: Input: 'hello' | Output: 'olleh
// reversing a string using stringBuilder

//          String str = "hello";
//          StringBuilder sb = new StringBuilder(str);
//         String reverse = sb.reverse().toString();
//         System.out.println(reverse);