public class Palindrome{
   static boolean isAlphaNumeric(char a){
        if ( a >='A' && a<='Z'){
            return true;
        }else if (a >='a' && a<='z'){
            return true;
        }else if(a >='0' && a<='9'){
            return true;
        }
      return false;
    }

    static boolean isSame(char a,char b){
        if(a == b){
            return true;
        }

        return (a== (b -'A'+'a') || (a -'A'+'a') == b);
    }

    static boolean SpecialPalindrome(String s){
        int left =0, right=s.length()-1;

        while (left < right){
            if(!isAlphaNumeric(s.charAt(left))){
                left++;
            }else if(!isAlphaNumeric(s.charAt(right))){
                right--;
            }else {if(!isSame(s.charAt(left),s.charAt(right))){
                return false;
            }
             left++;
            right--;
        }}
           
        return true;

    }
    public static void main(String shine[]){
System.out.println( SpecialPalindrome("level"));
System.out.println( SpecialPalindrome("levels"));
System.out.println( SpecialPalindrome("race a car"));
System.out.println( SpecialPalindrome("A man: nama"));
    }
}