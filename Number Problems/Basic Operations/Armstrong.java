import java.util.Scanner;

public class Armstrong {
    
    public static void ArmstrongNumber(int n){
        int temp1 =n;
        int temp2 =n;
        int power=0;
        int res=0;
     while(n>0){
        n=n/10;
        power++;
     }
     while(temp1 >0){
    int rem =temp1%10;
    int product =1;
     for(int i=0;i<power;i++){
     product = product*rem;
     }
    res= res+product;
    temp1 =temp1/10;
    }
    if(res == temp2){
        System.out.println("Armstrong number");
    }else{
        System.out.println("Not an Armstrong number");
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        ArmstrongNumber(sc.nextInt());
    }
}
