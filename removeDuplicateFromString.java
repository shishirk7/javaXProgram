import java.util.HashSet;

class removeDuplicateFromString{
public static int lengthOfLongestSubstring(String s){
    // Create a HashSet
    HashSet<Character> set = new HashSet<>();

    int left =0;
    int right  =0;
    int maxLength =0;
    while(right<s.length()){
        if(!set.contains(s.charAt(right))){
            set.add(s.charAt(right));
            right++;
            maxLength = Math.max(maxLength, right-left);


        }else{
            set.remove(s.charAt(left));
            left++;

        }}

        return maxLength;
    
    }
public static void main(String[] args){
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
}

}

