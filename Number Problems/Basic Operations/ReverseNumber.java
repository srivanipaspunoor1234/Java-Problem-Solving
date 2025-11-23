//Reverse a Number: Input: 1234 | Output: 4321 

 public class ReverseNumber {
    public static void main(String[] args) throws Exception {
     int n=1234;
     int rev=0;
     while(n>0){
     int rem = n%10;
     rev = rev*10+rem;
     n=n/10;
     }
        System.out.println(rev);
    }
    }