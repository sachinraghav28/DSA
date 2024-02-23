public class Generate_permutation {

    public static void main(String[] args) {

        String ans;
        per("sachin",ans="");

    }

    public static void per(String s,String ans){

        if(s.length()==0){
            System.out.println(ans);
            return;
        }

         for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            int beingindex;
            String s1=s.substring(beingindex=0,i);

            String s2=s.substring(i+1);

            per(s1+s2,ans+ch);

        }
    
    }
}

