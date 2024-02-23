public class factorial {
    /**
     * The above function calculates the factorial of a given number using recursion.
     * 
     * @param n The parameter "n" represents the number for which we want to calculate the factorial.
     * @return The factorial of the given number 'n' is being returned.
     */
    public static int fact(int n){
        if(n==1){
        
        return 1;
        }
        int sp=fact(n-1);
        int ans=n*sp;
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }    
}