public class Day56 {
        public static int prefixCount(String[] words, String pref) {
            int count = 0;
            for (String word : words) {
                if (word.startsWith(pref)) {
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args){
            String[] words=new String[]{"pay","attention","practice","attend"};
            String prev="at";
            System.out.println(prefixCount(words,prev));
        }
    
}
