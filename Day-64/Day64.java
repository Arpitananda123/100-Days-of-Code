import java.util.Arrays;

public class Day64 {
        public static int maxProduct(int[] nums) {
            Arrays.sort(nums);
            int k=nums.length;
            int m=(nums[k-1]-1)*(nums[k-2]-1);
            return m;
            
        }
        public static void main (String[] args){
            int[] nums=new int[]{3,4,5,2};
            System.out.println(maxProduct(nums));
        }
    
}
