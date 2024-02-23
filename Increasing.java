public class Increasing{
    public static void fact(int n){
        if(n==1){
            System.out.println(1);
            return;
             
        }
        fact(n-1);
        System.out.println(n);
       
    }
    public static void main(String[] args) {
        int n=5;
        fact(n);
        
}
}