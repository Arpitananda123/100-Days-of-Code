import java.util.Arrays;
public class Day68 {
        public static int[] sortedSquares(int[] nums) {
            for(int i=0;i<nums.length;i++){
                nums[i]=nums[i]*nums[i];
            }
            Arrays.sort(nums);
            return nums;
            
        }
        public static void main(String[] args){
            int[] nums=new int[]{-4,-1,0,3,10};
            int[] result=sortedSquares(nums);
            System.out.print("[ ");
            for(int i=0;i<result.length;i++){
                 System.out.print(result[i]+" ");
             }
             System.out.println("]");
        }
}
    

