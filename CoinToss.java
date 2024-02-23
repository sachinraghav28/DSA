/**
 * Subsequence
 */
public class CoinToss {
    public static void coin(int n,String ans){
        if (n==0) {
            System.out.println(ans);
            return;
            
        }
        coin(n-1, ans+"h");
        coin(n-1,ans+"t");
    }

    public static void main(String[] args) {
        int n=10;
        String ans="";
        coin(n,ans);
    }
}