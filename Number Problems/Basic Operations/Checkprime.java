// Check Prime: Input: 7 | Output: True

public class Checkprime {
     public static void main(String[] args) throws Exception {
    int n=7;
    boolean isPrime=true;
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            isPrime = false;
            break;
        }
    }
    System.out.println(isPrime);
    }
}
