import java.util.Scanner;
public class condition{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("1 pizza");
    System.out.println("2 burger");
    int choice = sc.nextInt();
    switch (choice){
        case 1:
            System.out.println("pizza");
    }
sc.close();
}
}
