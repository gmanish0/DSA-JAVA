import java.util.Scanner;

public class leap {
    public static void main(String[] args){
        System.out.println("enter eny no");
        Scanner yr = new Scanner(System.in);
        int ye = yr.nextInt();
        if(ye%4==0){
            if(ye%400==0)
            {
            System.out.println("the given no is leap year");
            }else
            {
            System.out.println("no");
            }
        }
        else
        {
            System.out.println("not leap year");

        }
        yr.close();

    }
    
        

    }   
