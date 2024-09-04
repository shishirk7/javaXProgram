public class uniqueChar {
    public static void main(String[] args) {
        String str = "shishirr";
        int st = unique(str);
        System.out.println(st);

    
}



public static int unique(String s){
    int[] charCount = new int[26];


    // count the frequency of each char
    for(int i=0;i<s.length();i++){
        charCount[s.charAt(i)-'a']++;

    }

    // 2nd pass

    for(int i=0;i<s.length();i++){
        if(charCount[s.charAt(i)-'a']==1){
            return i;
        }
    }
return -1;
}
}
