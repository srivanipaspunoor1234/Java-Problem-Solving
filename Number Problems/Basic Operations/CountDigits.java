import java.util.Scanner;

public class CountDigits {
    
    public CountDigits(int n){
        int count=0;
        if(n==0){
            count =1;
        }else{
        while(Math.abs(n)>0){
            count++;
            n=n/10;
        } 
    }
    System.out.println(count);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        CountDigits cd = new CountDigits(sc.nextInt());
       
    }
}
