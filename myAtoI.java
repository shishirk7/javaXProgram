public class myAtoI {
       public static void main(String[] args) {

              String s1 = "-042";
              System.out.print(AtoI(s1));

       }

       public static int AtoI(String s){

              //check that strinng is empty or not
              if(s.length() == 0 || s == null ){
                     return 0;
              }


           int i=0,result=0,sign=1;
           int n=s.length();
// check if pre space is present in string or not
// ignore leading spaces

           while(s.charAt(i)== ' ' && i<n){
              i++;

           }
//check for sign

           if(i<n  && (s.charAt(i)=='+' || s.charAt(i)== '-')){
              sign = (s.charAt(i)=='-') ? -1 :1;
              i++;
           }

           //convert digit(0-9) to integer
           while(i<n && Character.isDigit(s.charAt(i))){
              int digit = s.charAt(i)-'0';
           

           //check for overflow and handle it

           if(result > (Integer.MAX_VALUE-digit)/10){
              return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
           }

           result = result*10+digit;
           i++;
       }

       

       // apply sign and return
       return (sign*result);
}

}
