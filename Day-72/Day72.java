public class Day72{
        public static int sumOfGoodNumbers(int[] nums, int k) {
            int n = nums.length;
            int goodSum = 0;
    
            for (int i = 0; i < n; ++i) {
                if (i - k >= 0 && nums[i] <= nums[i - k])
                    continue;
                if (i + k < n && nums[i] <= nums[i + k])
                    continue;
                goodSum += nums[i];
            }
    
            return goodSum;
        }
        public static void main(String[] args){
            int[] nums=new int[]{1,3,2,1,5,4};
            int k=2;
            System.out.println(sumOfGoodNumbers(nums,k));
        }
    
}
