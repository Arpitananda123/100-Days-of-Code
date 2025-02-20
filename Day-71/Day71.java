import java.util.ArrayList;
public class Day71 {
    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i=i+2){
            int k=nums[i+1];
            for(int j=0;j<nums[i];j++){
                ans.add(k);
            }
        }
        int[] arr = ans.stream().mapToInt(i -> i).toArray();

        return arr;

        
        
    }
    public static void main(String[] args){
        int[] nums=new int[]{1,2,3,4};
        int[] result=decompressRLElist(nums);
            System.out.print("[ ");
            for(int i=0;i<result.length;i++){
                 System.out.print(result[i]+" ");
             }
             System.out.println("]");
    }
}
    

