
import java.util.Arrays;
public class Day66 {
        public static int heightChecker(int[] heights) {
            int count=0;
            int[] nums=new int[heights.length];
            for(int i=0;i<heights.length;i++){
                nums[i]=heights[i];
            }
            Arrays.sort(heights);
            for(int i=0;i<heights.length;i++){
                if(heights[i]!=nums[i]){
                    count+=1;
                }
            }
            return count;
    
            
        }
        public static void main(String[] args){
            int[] heights=new int[]{1,1,4,2,1,3};
            System.out.println(heightChecker(heights));
        }
    
    
}
