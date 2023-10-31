import java.util.Scanner;

public class FunctionTri {
    static void check(int a,int b,int d){
        if (a==b&&b==d&&a==d){
            System.out.println("Equilateral");
        }else if(a==b||b==d||d==a){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }
    }
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("enter the sides");
        int a= c.nextInt();
        int b= c.nextInt();
        int d= c.nextInt();
        check(a,b,d);
        c.close();
    }
    
}
