import java.util.Scanner;

public class forEven {
    public static void main(String[] args) {
        System.out.println("enter the no ");
        Scanner c=new Scanner(System.in);
        int n=c.nextInt();
        for(int i=1;i<n;i++){
            if(i%2==0){
                System.out.println("Even"+i);
            }else{
                System.out.println("odd"+i);
            }
        }
        c.close();
    }
    
}
