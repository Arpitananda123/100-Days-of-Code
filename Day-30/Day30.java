import java.util.Arrays;
import java.util.HashMap;

public class Day30 {
        public static String[] sortPeople(String[] names, int[] heights) {
            HashMap<Integer,String> map=new HashMap<>();
            for(int i=0;i<names.length;i++){
                map.put(heights[i],names[i]);
            }
            Arrays.sort(heights);
            String[] ans=new String[names.length];
            int j=0;
            for(int i=heights.length-1;i>=0;i--){
                ans[j]=map.get(heights[i]);
                j++;
            }
            return ans;
            
        }
        
        public static void main(String[] args){
            int[] heights=new int[]{180,165,170};
            String[] names=new String[]{"Mary","John","Emma"};
            String[] ans=sortPeople(names,heights);
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i]);
            }

        }
    
}