// Find the Greatest of Three Numbers: Input: 5, 10, 3 | Output: 10

public class GreatestNumber {
     public static void main(String[] args) throws Exception {
    int a=5, b=10, c=3;
    if(a>b && a>c)
        System.out.println(a);
    else if(b>a && b>c)
        System.out.println(b);
    else
        System.out.println(c);
    }
}
