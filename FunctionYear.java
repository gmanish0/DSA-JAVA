import java.util.Scanner;

public class FunctionYear {
    static void year(int n){
      //  System.out.println("hello");
        if(n%4==0){
             if(n%100!=0||n%400==0){
                System.out.println("Leap Year");
             }
        }else{
            System.out.println("Not a Leap Year");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the year");
        int n=s.nextInt();
        year(n);
        s.close();
    }
}
