import java.util.Arrays;
public class Day63 {
        public static int[] numberGame(int[] nums) {
            Arrays.sort(nums);
            int[] arr=new int[nums.length];
            for(int i=0;i<=nums.length-2;i=i+2){
                int k=nums[i];
                arr[i]=nums[i+1];
                arr[i+1]=k;
            }
            return arr;
            
        }
        public static void main(String[] args){
            int[] nums=new int[]{5,4,2,3};
            int[] result=numberGame(nums);
            System.out.print("[ ");
            for(int i=0;i<result.length;i++){
                 System.out.print(result[i]+" ");
             }
             System.out.println("]");
        }
    
}
