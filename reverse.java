
public class reverse{
    public static void main(String[] args){
        char[] ch = {'h','e','l','l','o'};

        rev(ch);

        System.out.print(new String(ch));



    }


    public static void rev(char[] s){
        int start =0;
        int end = s.length-1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}