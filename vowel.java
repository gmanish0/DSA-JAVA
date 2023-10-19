import java.util.Scanner;

public class vowel{
    public static void main(String[] args) {
        Scanner vowel =new Scanner(System.in);
        System.out.println("enter the char");
        char c = vowel.next().charAt(0);
        if(c=='a'|| c=='A'||c=='e'|| c=='E'||c=='i'|| c=='I'||c=='o'|| c=='O'||c=='u'||c=='U'){
            System.out.println("the given char is vowel");
        }else{
            System.out.println("not vowel");
        }
        vowel.close();
        }
}