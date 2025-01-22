class Checksort{
    public static boolean Checkissorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                 return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
       int arr[]={34,46,78,89};
       boolean ans=Checkissorted(arr);
       System.out.println("Is sorted or not?"+ ans);
    }
}