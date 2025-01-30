public class Day52 {
        public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
            int count=0;
            for(int i=0;i<endTime.length;i++){
                if(endTime[i]>=queryTime && startTime[i]<=queryTime){
                    count+=1;
                }
            }
            return count;
            
        }
        public static void main(String[] args){
            int[] startTime=new int[]{1,2,3};
            int[] endTime=new int[]{3,2,7};
            int queryTime=4;
            System.out.println(busyStudent(startTime,endTime,queryTime));
        }
    
}
