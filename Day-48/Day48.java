public class Day48 {
        public static int numberOfSteps(int num) {
            int count=0;
            int k=num;
            while(num!=0){
                if(k%2==0){
                   num/=2;
                   k=num;
                   count+=1;
                }else{
                    num=num-1;
                    k=num;
                    count+=1;
                }
            }
            return count;
            
        }
        public static void main (String[] args){
            int num=14;
            System.out.println(numberOfSteps(num));

        }
    
    
}
