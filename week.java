import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner we =new Scanner(System.in);
        int wee =we.nextInt();
        if(wee==1){
            System.out.println("monday");
        }else if (wee==2) {
            System.out.println("tues");
        } else if(wee==3) {
            System.out.println("wednes");
        } else if (wee==4) {
            System.out.println("thurs");
        } else if (wee==5) {
            System.out.println("fri");            
        } else if (wee==6) {
            System.out.println("sat");
            
        } else if(wee==7){
            System.out.println("sum");
        }            else{
            System.out.println("wrong choice");
        }
        
        we.close();
    }
    
}
