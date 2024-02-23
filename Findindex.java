public class Findindex {
    public static int find(int arr[],int item,int i){
        if (i==arr.length) {
            return -1;
            
        }
        if (arr[i]==item) {
            return i;
            
        }
        return find(arr,item,i+1);
    }
    public static int  sorted(int arr[],int i){
        if (arr[i]>arr[i+1]) {
            System.out.println("not sorted");
            return  i;
            
        }
        return sorted(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        int item=4;
        int i=0;
        System.out.println(find(arr,item,i));
        System.out.println(sorted(arr,i));
    }
    
}
