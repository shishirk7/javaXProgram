import java.util.Map;
import java.util.HashMap;

public class romanToInt {
    

    public static int values(String s){

        Map<Character,Integer> romanInt = new HashMap<>();
        romanInt.put('I',1);
        romanInt.put('V',5);
        romanInt.put('X',10);
        romanInt.put('L',50);
        romanInt.put('C',100);
        romanInt.put('D',500);
        romanInt.put('M',1000);

        int total=0;
        int pre=0;

        for(int i=s.length()-1;i>=0;i--){
            int curr = romanInt.get(s.charAt(i));
            if(curr<pre){
                total -= curr;
            }else{
                total += curr;
                
            }
            pre = curr;


        }
        return total;
       

    }


    public static void main(String[] args){
        System.out.println(values("CD"));
    }
}
