// Find Factorial: Input: 5 | Output: 120

public class Factorial {
    public static void main(String[] args) throws Exception {
    int n=5;
    int fact=1;
    for(int i=1;i<=n;i++){
        fact =fact*i;
    }
    System.out.println(fact);
    }
}
