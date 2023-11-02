import java.util.Scanner;

public class FUNInsurence {
    static void Insurence(String n,String g,int a,String ci, int i){
        if(a>=25&&a<=35&&g=="male"&&ci=="metro"){
            System.out.println("Premium is 6%");
        }else if(a>=25&&a<=40&&g=="male"&&ci=="non metro"){
            System.out.println(" Premium 4%");
        }else if(a>=25&&a<=42&&g=="female"&&ci=="metro"){
            System.out.println(" Premium 3%");
        }else if(a>=25&&a<=45&&g=="female"&&ci=="non metro"){
            System.out.println(" Premium 2%");
        }else{
            System.out.println("Not Insured");
        }

    }
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("enter the name");
        String n =c.nextLine();
        System.out.println("enter the gender");
        String g =c.nextLine();
        System.out.println("enter the age");
        int a= c.nextInt();
        System.out.println("entre the city (METRO/NON-METRO)");
        String ci =c.nextLine();
        Insurence(n , g ,a, ci, 45);
        c.close();
    }
    
}
