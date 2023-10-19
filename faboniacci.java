public class faboniacci {
    int n1=0 ,n2=0; 
    int n3=0;
    
    for(int i=2;i<10;++i){
       n3=n2+n1;
       System.out.println("  "  +n3);
       n1=n2;
       n2=n3;
    }
    
}
