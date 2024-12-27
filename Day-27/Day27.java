import java.util.Arrays;
public class Day27 {
        public static int maximumWealth(int[][] accounts) {
            int n=accounts.length;
            int max=-1;
            for(int i=0;i<n;i++){
               int sum = Arrays.stream(accounts[i]).sum();
               max=Math.max(sum,max);
    
            }
            return max;
            
        }

        public static void main(String[] args){
            int[][] arr=new int[][]{{1,2,3},{3,2,1}};
            System.out.println(maximumWealth(arr));
        }
    
    
}
