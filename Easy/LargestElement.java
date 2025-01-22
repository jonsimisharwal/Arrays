class LargestElement{
    public static int FindLargestelement(int arr[]){
        int val=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            val=Math.max(val,arr[i]);
        }
        return val;
    }
    public static void main(String args[]){
     int arr[]={0,-1,2,34,56};
     int ans=FindLargestelement(arr);
     System.out.println("The largest element is:"+ ans);
    }
}