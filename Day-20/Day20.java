

public class Day20 {
        public static int sumOfTheDigitsOfHarshadNumber(int x) {
            int m=x;
            int count=0;
            while(m!=0){
                int t=m%10;
                count+=t;
                m/=10;
            }
    
            if(x%count==0){
                return count;
            }else{
                return -1;
            }
            
        }

        public static void main(String[] args){
            int x=18;
            int ans=sumOfTheDigitsOfHarshadNumber(x);
            System.out.println(ans);

        }
    
    
}
