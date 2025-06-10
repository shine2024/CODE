public class MyPall{
    
public static boolean isAlphaNumeric(char s){
    if(s>='a' && s<='z' || s>='A' && s<='Z' || s>='0' && s<='9'){
        return  true;
    }
    return false;
}
 public static boolean isSame(char a,char b){
        if(a == b){
            return true;
        }

        return (a== (b -'A'+'a') || (a -'A'+'a') == b);
    }
    public static boolean specialPal(String s){
    int left=0;
    int right=s.length()-1;

    while(left<right){
     if(!isAlphaNumeric(s.charAt(right))){
      right--;
     }else if (!isAlphaNumeric(s.charAt(left))){
        left++;
     }else if(isSame(s.charAt(right),s.charAt(left))){
         left++;
    right--;
     }else{
        return false;
     }
    }
     return true;
    }


    public static void main(String[] args) {
        System.err.println(specialPal("TOmato"));
        System.out.println( specialPal("level"));
System.out.println( specialPal("levels"));
System.out.println( specialPal("race a car"));
System.out.println( specialPal("A man: nama"));
    }
}