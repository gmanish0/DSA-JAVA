import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter length");
        int l = s.nextInt();
        System.out.println("enter breadth");
        int b = s.nextInt();
        System.out.println("the area is = "+ (l*b));
        s.close();
        
    }
    
}
