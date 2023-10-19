import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        System.out.println("ENTER THE NOS");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("1.ADDITION"+"\n"+"2.SUBTRACTION"+"\n"+"3.MULTIPLICATION"+"\n"+"4.DIVISION");
        int n=sc.nextInt();
        int c=0;
        switch(n){
            case 1:
            {
                c=a+b;
                System.out.println("the sum of 2 no is:"+c);
                break ;
            }
            case 2:
            {
                c=a-b;
              System.out.println("subtraction of 2 no is:"+c);
              break;
            }
            case 3:
            {
                c=a*b;
                System.out.println("mulyiplication of 2 is :"+c);
                break;
            }
            case 4:
            {
                System.out.println("divisuion of 2 no is:"+a/b);
            }


    
        }
        sc.close();

    }
    
}
