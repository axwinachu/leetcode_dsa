class BinarySearch{
    public static void main(String[] args) {
        int[] arr={1,23,46,89,100};
        // int target=46;
        // int start=0;
        // int end=arr.length-1;
        // while (start<=end) {
        //    int mid=(start+end)/2;
        //    if(arr[mid]<target){
        //     start=mid+1;
        //    }else if(arr[mid]>target){
        //     end=mid-1;
        //    }
        //    else{
        //     System.out.println(mid);
        //    }
        // }
        int target=56;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
               System.out.println(arr[mid]);
               break;
            }
            if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(arr[start]);
    }
}