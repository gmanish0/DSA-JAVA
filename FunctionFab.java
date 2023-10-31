import java.util.Scanner;

public class FunctionFab {
    static void fab(int n){
        int a=0,b=1,c=0;
        if (n==0){
            System.out.println(a);
        }else if(n==1){
            System.out.println(a+" "+b);
        }else{
            System.out.print(a);
            for(int i=2;i<=n;i++){
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
                    }
            }
        }
    
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("enter the index no");
        int n= c.nextInt();
        fab(n);

        c.close();

    }
    
}
