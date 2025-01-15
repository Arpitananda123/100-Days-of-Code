public class Day44 {
        public static int xorOperation(int n, int start) {
            int[] nums=new int[n];
            int ans=0;
            for(int i=0;i<n;i++){
                nums[i]=start+2*i;
                ans=(ans + nums[i] - (2 * (ans & nums[i])));
            }
            return ans;
        
            
        }
        public static void main(String[] args){
            int n=5;
            int start=0;
            System.out.println(xorOperation(n,start));
        }
    
}
