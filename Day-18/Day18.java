

public class Day18 {
        public static int climbStairs(int n) {
            int a=1;
            int b=1;
            for(int i=1;i<n;i++){
                b+=a;
                a=b-a;
            }
            return b;
    
            
        }

        public static void main(String[] args){
            int n=3;
            int k=climbStairs(n);
            System.out.println(k);
        }
    
    
}
