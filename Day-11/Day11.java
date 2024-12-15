public class Day11 {
        public static int removeDuplicates(int[] nums) {
            int j = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;
            
        }

        public static void main(String[] args){
            int[] num=new int[] {1,1,2};
            int k=removeDuplicates(num);
            System.out.println(k);

        }
        
    
    
}
