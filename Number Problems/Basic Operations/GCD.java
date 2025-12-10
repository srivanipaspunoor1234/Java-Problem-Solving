import java.util.Scanner;

public class GCD {
    
    public static void FindGCD(int a, int b){
    a = Math.abs(a);
    b = Math.abs(b);
    int x =Math.min(a, b);
    int ans=1;

    if(a==0 && b==0){
        System.out.println("GCD undefined for 0 and 0");
        return;
    }
    if(a==0){
        System.out.println(b);
        return;
    }
    if(b==0){
        System.out.println(a);
        return;
    }
    for(int i=1;i<=x;i++){
        if(a%i==0 && b%i==0){
            ans =i;
        }
    }
    System.out.println(ans);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.err.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
         FindGCD(a, b);
    }
}
