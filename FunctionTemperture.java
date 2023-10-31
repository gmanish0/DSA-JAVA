import java.util.Scanner;

public class FunctionTemperture {
    static double celsius(double temp){
        double fahrenheit = (temp * 9/5) + 32;
        return fahrenheit ;
    }
    static double fahrenheit(double temp){
        double celsius = ((temp - 32) * 9/5);
        return celsius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature");
        double temp = sc.nextDouble();
        double c= celsius(temp);
        double f=fahrenheit(temp);
        System.out.print("The temperture in celsius is ");
        System.out.println(c);
        System.out.print("The teperture in fahrenheit is ");
        System.out.println(f);
sc.close();
    } 
    
}
