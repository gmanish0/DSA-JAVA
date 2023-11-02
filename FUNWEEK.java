import java.util.Scanner;

public class FUNWEEK {
    static void week(int wee){
        if(wee==1){
            System.out.println("monday");
        }else if (wee==2) {
            System.out.println("tuesday");
        } else if(wee==3) {
            System.out.println("wednesday");
        } else if (wee==4) {
            System.out.println("thursday");
        } else if (wee==5) {
            System.out.println("friday");            
        } else if (wee==6) {
            System.out.println("satday");
            
        } else if(wee==7){
            System.out.println("sumday");
        }            else{
            System.out.println("wrong choice");
        }
        
    }
    static void month(int m){
        switch(m){
            
            case 1 :
                System.out.println("january");
                break;
            case 2 : 
                System.out.println("february");
                break;        
            case 3:
                System.out.println("march");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6: 
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8 :
                System.out.println("Augest");
                break;
            case 9: 
                System.out.println("september");
                break;
            default:
                System.out.println("you have a wrong choice");
           }
       }
    public static void main(String[] args) {
        System.out.println("enter week no");
        Scanner we =new Scanner(System.in);
        int wee =we.nextInt();
        System.out.println("enter month");
        int m=we.nextInt();
        week(wee);
        month(m);
        we.close();
    }
}
