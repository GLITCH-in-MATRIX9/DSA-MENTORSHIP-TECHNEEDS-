import java.util.Scanner;

public class digits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int count=0;
        for(;n>0;n/=10){
            count++;
        }
        System.out.println(count);
    }
}
