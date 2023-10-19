import java.util.Scanner;

public class LIGHT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int light=sc.nextInt();
        switch(light){
            
            case 1 :
                System.out.println("red");
                break;
            case 2 :
                System.out.print("yellow");
                break;
            case 3:
                System.out.println("green");
                break;
            default:
            System.out.println("invalid no.");
        } 
        sc.close();
    
    }
}
