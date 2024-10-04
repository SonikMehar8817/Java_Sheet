package String_Questions;

public class Q1_Palindrome {
    public static boolean checkPalindrome(String s){
        // String temp = "";
        // for(int i=s.length()-1;i>=0;i--){
        //     temp+=s.charAt(i);
        // }
        // if(s.equals(temp)){
        //     return true;
        // }
        int i=0,j=s.length()-1;
        while (i<j) {
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
   public static void main(String[] args) {
       String s = "sonoos";
       if(checkPalindrome(s)){
            System.out.println("String is palindrome");
       }
       else{
        System.out.println("not palindrome");
       }
   }
    
}