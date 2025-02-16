import java.util.Arrays;
public class Day67 {
        public static int findNonMinOrMax(int[] nums) {
            Arrays.sort(nums);
            if(nums.length==2 || nums.length==1){
                return -1;
            }
            else{
                return nums[1];
            }
            
        }
        public static void main(String[] args){
            int[] nums=new int[]{3,2,1,4};
            System.out.println(findNonMinOrMax(nums));
        }
    
    
}
