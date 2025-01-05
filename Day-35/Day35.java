public class Day35 {
        public static int countAsterisks(String s) {
            int res = 0;
            int bars = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '*' && bars % 2 == 0)
                    res++;
                if(s.charAt(i) == '|')
                    bars++;
            }
            return res;
        }
        
        public static void main(String[] args){
            String s = "l|*e*et|c**o|*de|";
            System.out.println(countAsterisks(s));
        }
    
}
