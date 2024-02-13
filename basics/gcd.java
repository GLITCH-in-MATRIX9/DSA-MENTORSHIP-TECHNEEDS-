import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        int gcd=0,lcm;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
                
            }
                
        }   
        System.out.println(gcd);
    }
}
