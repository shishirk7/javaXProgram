public class hayStack_needle {
    public static void main(String[] args) {
        String s="leetcode";
        String p="eto";
        int n= hack(s,p);
        System.out.println(n);
    
}


public static int hack(String s,String st){
    if(st.isEmpty()){
        return 0;
    }

    return s.indexOf(st);
}


}