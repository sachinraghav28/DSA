public class Rotate_k_times_array_sorted{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        k=k%arr.length;
        reverse(arr,len);

        
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
    }
    public static void reverse(int si,int ei,int ar[]){
        while(si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
    }
    
}
