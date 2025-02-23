public class Day74 {
        public static int addDigits(int num) {
           return 1+(num-1)%9;
        }
        public static void main(String[] args){
            int a=38;
            System.out.println(addDigits(a));
        }
    
}
