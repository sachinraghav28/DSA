public class Power{
    public static int power(int x,int y){
        if (y==0) {
            return 1;
            
        }
         int sp=power(x,y-1);
         int ans=x*sp;
         return ans;
        
    }
    public static void main(String[] args) {
        int x=2;
        int y=3;
        System.out.println(power(x,y));
    }
    
}
