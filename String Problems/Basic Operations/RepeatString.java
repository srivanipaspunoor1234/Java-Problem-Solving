// Repeat a String: Input: 'abc', 3 | Output: 'abcabcabc'

public class RepeatString {
public static void main(String[] args) throws Exception {
    String str ="abc";
    int n=3;
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<n;i++){
    sb.append(str);
    }
    System.out.print(sb.toString());
    }
}

// using repeat() method

// public class Strings {
//     public static void main(String[] args) throws Exception {
//     String str ="abc";
//     int n=3;
//     System.out.println(str.repeat(n));
//     }
// }