class peakIndex{
    public static void main(String[] args){
        int[] arr = {1,2,3,8};
        int ans = peak(arr);
        System.out.println(ans);

    }
    public static int peak(int[] arr){
        int left = 0;
        int right=arr.length-1;
        while(left<right){
        
            int mid = left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
                right = mid;
            }else{
                    left = mid+1;

                }
            
        }
        return left;
    }
}