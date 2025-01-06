import java.util.ArrayList;
public class Day36 {
        public static ArrayList<Integer> stableMountains(int[] height, int threshold) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i=1;i<height.length;i++){
                    if(height[i-1]>threshold){
                        list.add(i);
                        
                    }
                
    
    
            }
            return list;
            
        }

        public static void main(String[] args){
            int[] height=new int[]{1,2,3,4,5};
            int threshold=2;
            System.out.println(stableMountains(height,threshold));

        }
    
    
}
