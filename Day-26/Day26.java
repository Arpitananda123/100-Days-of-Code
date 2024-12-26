public class Day26 {
        public static int minimumOperations(int[] nums) {
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]%3!=0){
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args){
            int[] nums=new int[]{1,2,3,4};
            System.out.println(minimumOperations(nums));

        }
    
    
}
