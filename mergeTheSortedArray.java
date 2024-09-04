public class mergeTheSortedArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,0,0,0};
        int m =3;
        int[] b ={ 5,6,7};
        int n=3;

        merge(a,m,b,n);
        for(int num:a){
            System.out.print(num+" ");
        }

}


public static void merge(int[] a,int m,int[] b,int n){
    int i = m-1;
    int j = n-1;
    int k =m+n-1;


    while(i>=0 && j>=0){
        if(a[i]>b[j]){
            a[k--] = a[i--];
    }
    else{
        a[k--] = b[j--];
    }


}


while(j>=0){
    a[k--] = b[j--];
}
}
}