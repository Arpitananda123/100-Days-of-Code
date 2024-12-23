public class Day23 {
        public static int[] buildArray(int[] nums) {
            int[] arr1=new int[nums.length];
            for(int i=0;i<nums.length;i++){
                arr1[i]=nums[nums[i]];
            }
            return arr1;
    
            
        }
        public static void main(String[] args){
            int[] nums=new int[]{0,2,1,5,3,4};
            int[] result=buildArray(nums);
            System.out.print("[ ");
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println("]");
        }
}
    
    

