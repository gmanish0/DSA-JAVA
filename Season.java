import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the months");
        int month=sc.nextInt();
        switch(month){
            
            case 1 :
            case 2 :         
            case 3:
            case 10:
            case 11:
            case 12:
                System.out.println("winter");
                break;
      
            
            case 4:
            case 5:
            case 6: 
            case 7:
            case 8 :
            case 9: 
                System.out.println("summer");
                break;
            default:
                System.out.println("you have a wrong choice");
                
        }
        sc.close();
    }
    

    }
    

