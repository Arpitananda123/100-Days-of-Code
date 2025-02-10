import java.util.Arrays;

public class Day62 {
        public static int minMovesToSeat(int[] seats, int[] students) {
            Arrays.sort(seats);
            Arrays.sort(students);
            int mov=0;
            for(int i=0;i<seats.length;i++){
                int k=Math.abs(students[i]-seats[i]);
                mov+=k;
            }
            return mov;
        }
        public static void main(String[] args){
            int[] seats=new int[]{3,1,5};
            int[] students=new int[]{2,7,4};
            System.out.println(minMovesToSeat(seats,students));
        }
    
}
