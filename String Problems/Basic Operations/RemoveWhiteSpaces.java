// Remove White Spaces: Input: 'hello world' | Output: 'helloworld'
//  using split method
public class RemoveWhiteSpaces {
    
     public static void main(String[] args) throws Exception {
    String str="hello world";
    StringBuilder sb=new StringBuilder();
    String[] arr=str.split(" ");
         for (String str1 : arr) {
             sb.append(str1);
         }
   System.out.println(sb.toString());
    }
}


// using replace method

//    String s= "hello world";
//    String res=s.replace(" ","");
//    System.out.println(res);
//     }
// }