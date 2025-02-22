public class Day73 {
        public static boolean canAliceWin(int n) {
            int count = 0;
            int pile = 10;
    
            while (n >= pile) {
                n -= pile;
                pile--;
                count++;
            }
    
            return count % 2 != 0;
        }
        public static void main(String[] args){
            int n=12;
            System.out.println(canAliceWin(n));
        }
    
    
}
