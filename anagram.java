import java.util.Arrays;

class Solution {
    public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }
        
        char[] g = s.toCharArray();
        char[] h= t.toCharArray();
        
        Arrays.sort(g);
        Arrays.sort(h);
        
       return Arrays.equals(g,h);
        
        
    }
    
    
    public static void main(String[] args){
        String s = "car";
        String t ="rat";
        
        boolean b = isAnagram(s,t);
        System.out.print(b);
        
    }
}