import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner c=new Scanner(System.in);
        int n=c.nextInt();
        int count=0;
        int r=0;
        while(n>0){
        r=n%10;
        count=count+1;
        n=n/10;}
        System.out.println(count);
        c.close();
    }
    
}
