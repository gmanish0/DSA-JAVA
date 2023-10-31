import java.util.Scanner;

public class FUNpositive {
    static void check(int n){
        if (n>=-210){
            System.out.println("The number "+n+" is positive");
        }else{
            System.out.println("The number "+n+" is negative");
        }
    }
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("enter the no");
        int n= c.nextInt();
        check(n);
        c.close();


    }
    
}
