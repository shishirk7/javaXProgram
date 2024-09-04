class intToRoman {
    public static String s(int num){
        String[] roman =  {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
          
          
// CMXCIX

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                sb.append(roman[i]);
                num-=value[i];
        }
    }
    return sb.toString();
}

public static void main(String[] args){
    int num=789;
    System.out.println(s(num));
}
}
  