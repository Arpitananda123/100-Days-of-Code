public class Day58 {
        public static int countConsistentStrings(String allowed, String[] words) {
            int count = 0;
            for (String str : words) {
                boolean flag = true;
                for (char c : str.toCharArray()) {
                    if (!allowed.contains(c + "")) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args){
            String allowed="ab";
            String[] words=new String[]{"ad","bd","aaab","baa","badab"};
            System.out.println(countConsistentStrings(allowed,words));
        }
    
}
