public class xor {
    public static void main(String[] args) {


        //xor is used to find the unique element is arrays;

        int[] a={1,2,3,4,5,5,1,2,3,8,8};
        int result=0;
        for(int num:a){
            result ^= num;
        }
        System.out.println(result);
    
        

    }
}
