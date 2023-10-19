import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        System.out.println("welcome to sbi");
        System.out.println("1.Credit");
        System.out.println("2.Debit");
        System.out.println("3.Balance");
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the choice ");
        int choice=c.nextInt();
        //int cr=0;
        int b=0;
       // char h;
     do{
        switch(choice){
            case 1:
            {
                System.out.println("enter the amount");
                
                int cr=c.nextInt();
                b=b+cr;
                break;
            }
            case 2:
            {
                System.out.println("enter the amount");
                int cr=c.nextInt();
                if(cr>b){
                    b=b-cr;
                }
                else{
                    System.out.println("dont have sufficent balance");
                }
            }
            case 3:
            {
                System.out.println(b);
                //PrintStream.print(b);
            }
            default:
            {
                System.out.println("do u want to continue(y/n)");
                char h=c.next().charAt(0);
            }
        }// char c = vowel.next().charAt(0);
        }
        while((h=="y")||(h=='Y')) ;   
        c.close();
    }
    
}
