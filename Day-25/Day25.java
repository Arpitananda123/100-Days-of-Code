

public class Day25 {
        public static int[] getSneakyNumbers(int[] nums) {
            int[] freq = new int[nums.length];
            for(int num:nums){
                freq[num]++;
            }
            
            int[] res = new int[2];
            int idx=0;
            for(int i=0; i<freq.length; i++){
                if(freq[i]==2){
                    res[idx++]=i;
                }
            }
            return res;
        }

        public static void main(String[] ans){
            int[] arr=new int[]{0,1,1,0};
            int[] result=getSneakyNumbers(arr);
            System.out.print("[ ");
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println("]");
            
        }
    
    
}
