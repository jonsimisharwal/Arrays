class Removeduplicates{
    public  static void Removeduplicates(int arr[]){
        Map<Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mp.contains(arr[i])){
                mp.put(arr[i]);
            }
        }
        return mp;
    }
    public static void main(String args[]){

    }

}