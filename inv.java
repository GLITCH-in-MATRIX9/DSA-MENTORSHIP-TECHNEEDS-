import java.util.Scanner;

public class inv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i=1;
        int res=0;
        for(;n>0;n/=10){
            int index=n%10;
            res=res+i*(int)Math.pow(10,index-1);
            i++;
        }
        System.out.println(res);
    }
}
