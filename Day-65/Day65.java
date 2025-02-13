import java.util.Arrays;

public class Day65 {
        public static int maxProductDifference(int[] nums) {
            Arrays.sort(nums);
            int m=nums[0]*nums[1];
            int k=nums[nums.length-1]*nums[nums.length-2];
            return k-m;
            
        }
        public static void main(String[] args){
            int[] nums=new int[]{5,6,2,7,4};
            System.out.println(maxProductDifference(nums));
        }
    
    
}
