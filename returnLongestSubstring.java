import java.util.HashSet;

public class returnLongestSubstring {

public static int longs(String s){

    HashSet<Character> set = new HashSet<>();
    if(s.length()==0){
        return 0;
    }

    int left=0;
    int right=0;
    int m=0;

    while(right<s.length()){
        if(!set.contains(s.charAt(right))){
            set.add(s.charAt(right));
            right++;
            m = Math.max(m, right-left);
        }
        else{
            set.remove(s.charAt(left));
            left++;
        }
    }

    return m;

}



    public static void main(String[] args){

        String str = "abacbaac";
        System.out.println(longs(str));
    }
    
}
