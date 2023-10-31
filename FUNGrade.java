import java.util.Scanner;

public class FUNGrade {
    static void check(int n){
        if (n >= 90){
            System.out.println("A");
        }else if(70<=n&&n < 89){
            System.out.println("B");
        }else if (50<=n&&n<69){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("enter the number");
        int n= c.nextInt();
        check(n);
        c.close();
    }
    
}
