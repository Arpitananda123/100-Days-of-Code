
public class day2 {
    public static int[] getConcatenation(int[] nums) {
        int result[]=new int[nums.length*2];

        for(int i=0;i<nums.length;i++){
            result[i]=nums[i];
            
        }
        int k=nums.length*2;
        for(int i=nums.length;i<k;i++){
            result[i]=nums[i-nums.length];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr=new int[] {1,3,2,1};
        int[] conarr=getConcatenation(arr);
        for(int i=0;i<conarr.length;i++){
            System.out.print(conarr[i]);
        }
    }   

}
