import java.util.Scanner;

public class Evenodd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in );
        int x;
        x=sc.nextInt();
        System.out.println((x%2==0)?"even":"odd");
        sc.close();

    }
}