//  Change Case: Input: 'Hello' | Output: 'hELLO'

public class ChangeCase {
    
    public static void main(String[] args) throws Exception {
      String str="Hello";
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if( ch >='A' && ch <='Z'){
      ch = (char)(ch+32);
      }
      else if(ch >='a' && ch<='z'){
      ch= (char)(ch-32);
      }
     sb.append(ch);
    }  
   System.out.println(sb.toString());
    }
}

