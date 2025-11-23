// Compare Two Strings: Input: 'abc', 'abc' | Output: True


public class CompareStrings {
public static void main(String[] args) throws Exception {
   String str1 ="abc";
   String str2 = "abc";
   boolean isSame = true;
    if(str1.length()!=str2.length()){
       isSame = false;
    }else{
  for(int i=0;i<str1.length();i++){
    if(str1.charAt(i)!=str2.charAt(i)){
        isSame = false;
        break;
  }
}
   }
  System.out.println(isSame);
}
}

// Compare Two Strings: Input: 'abc', 'abc' | Output: True
// using equalsto method

// public class Strings {
//     public static void main(String[] args) throws Exception {
//     String str1 ="abc";
//     String str2 ="abc";
//     System.out.println(str1.equals(str2));
//     }
// }