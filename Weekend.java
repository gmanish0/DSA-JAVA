import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the days");
        int day=sc.nextInt();
        switch(day){
            
            case 1:
            
                System.out.println("MONDAY WEEKDAY");
                break;
            case 2:
            
                System.out.println("TUESDAY WEEKDAY");
                break;
            case 3:
            
                System.out.println("WEDNESDAY WEEKDAY");
                break;
            case 4:
            
                System.out.println("THURSDAY WEEKDAY");
                break;
            case 5:
            
                System.out.println("FRIDAY WEEKDAY");
                break;
            case 6:
                            System.out.println("SATURDAY HALFDAY");
                break;
            case 7:
            
                System.out.println("SUNDAY HOLIDAY");
                break;
            default:
                System.out.println("you have a wrong choice");
                
        }
        sc.close();
    }
    
}
