public class Countmazepath {
    public static int mazepath(int ci,int cr,int cc,int er,int ec,String ans){
        if (cc==ec&&cr==er) {
            System.out.println(ans);
            return 1;
            
        }
        if(cc>ec&&cr<er){
            System.out.println();
            return 0;
        }
        int h=mazepath(cc+1,cr,ec,er, h, ans+"h");
        int v=mazepath(cc,cr+1,ec,er, v, ans+"v");
    }
    public static void main(String[] args) {
        int ci=0;
        int cr=0;
        int cc=0;
        int er=4;
        int ec=4;
        String ans="";
        mazepath(ci,cr,cc,er,ec,ans);
    }
    
}
