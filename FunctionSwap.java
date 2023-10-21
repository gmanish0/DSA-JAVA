import java.util.Scanner;

public class FunctionSwap {
    static void Swap(int x,int y){
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swpping"+x+" "+y);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter nos");
        int x=s.nextInt();
        int y=s.nextInt();
        Swap(x,y);
        s.close();
    }
}
