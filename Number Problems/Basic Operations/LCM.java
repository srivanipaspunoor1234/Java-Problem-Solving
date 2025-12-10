public class LCM {
    
    public static void FindLcm(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        int x = Math.max(a, b);
        int y = a*b;
        int ans =x;
        if (a == 0 && b == 0) {
        System.out.println("LCM undefined for 0 and 0");
        return;
        }
        if (a == 0 || b == 0) {
        System.out.println(0);
       return;
        }
        for(int i=x;i<=y;i++){
            if(i%a==0 && i%b==0){
               ans =i;
               break;
            }
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        FindLcm(14,16);
    }
}
