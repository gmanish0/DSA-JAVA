public class plus {
    public static void main(String[] args) {
        int i ,j;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++){
                if(i==4||j==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    
}
