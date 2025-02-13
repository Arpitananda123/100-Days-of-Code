

public class Day28 {
        public static String reverseOnlyLetters(String s) {
         String letters = ""; 
            for (int i = s.length() - 1; i >= 0; i--) {
                if (Character.isLetter(s.charAt(i))) {
                    letters += s.charAt(i); 
                }
            }
            String result = ""; 
            int index = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i))) {
                    result += letters.charAt(index++); 
                } else {
                    result += s.charAt(i); 
                }
            }
    
            return result;
            
        }
        
        public static void main(String[] args){
            String s = "ab-cd";
            System.out.println(reverseOnlyLetters(s));
        }
    
}
