public class SumNaturalNO {
    public static int natural(int n){
        if (n==1) {
            return 1;
        
        }
        
        int Sum1=natural(n-1);
        int Sumn=n+Sum1;
        return Sumn;
       
     
       

    }

    public static void main(String[] args) {
        int n=5;
        natural(n);
    }
    
}
