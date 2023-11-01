import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
    
        int count=0;
        int rev=0;
        for(;n>0;n/=10){
            rev=rev*10+(n%10);
        }
        for(;rev>0;rev/=10){
            System.out.println(rev%10);
        }
        
    }
}
