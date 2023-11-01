import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int count=0,org=n;
        for(;n>0;n/=10){
            count++;
        }
        int num=0;
        k=k%count;
        if(k<0){
            k=k+count;
        }
        int div=(int)Math.pow(10,k);
        int quo=org/div;
        int rem=org%div;
        int mul=(int)Math.pow(10,(count-k));
        num=(rem*mul)+quo;
        
        System.out.println(num);
    }
}
