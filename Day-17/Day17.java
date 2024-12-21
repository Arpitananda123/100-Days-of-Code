import java.util.ArrayList;
public class Day17 {
        public static ArrayList<Integer> selfDividingNumbers(int left, int right) {
            ArrayList<Integer> L1=new ArrayList<Integer>();
            boolean div=true;
            for(int i=left;i<right+1;i++){
                div=true;
                int m=i;
                while(m!=0){
                    int k=m%10;
                    m/=10;
                    if(k==0||i%k!=0){
                        div=false;
                        break;
                    }
                }
                if(div){
                    L1.add(i);
                }
            }
            return L1;
            
        }
        
        public static void main(String[] args){
           int left=1;
           int right=22;
           System.out.println(selfDividingNumbers(left,right));
        }
    
    
}
