import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner c=new Scanner(System.in);
        int n=c.nextInt();
        int i=0 ;
        int f=0;
        for(i=n;i>0;i--){
            f=f*i;
        }
        System.out.println(f);
    }
    
}
