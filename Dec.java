public class Dec {
    public static void fact(int n){
        if(n==1){
            System.out.println(1);
            return;
             
        }
        
        System.out.println(n);
        fact(n-1);
       
    }
    public static void main(String[] args) {
        int n=5;
        fact(n);
        
}
}
    

