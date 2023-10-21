import java.util.Scanner;

public class FunctionArea {
    static float area(float i,float b){
        return (i*b);
    }
    static float perimeter(float l,float b){
        return (2*(l+b));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the sides");
        float l=s.nextFloat();
        float b=s.nextFloat();
        float x=area(l,b);
        System.out.println(x);
        float y=perimeter(l,b);
        System.out.println(y);
        s.close();
    }
}
