
import java.util.Arrays;
public class day6 {
        public static char findTheDifference(String s, String t) {
            char[] arr1=s.toCharArray();
            char[] arr2=t.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(s.length()==0){
                return arr2[0];
            }
            else{
                for(int i=0;i<arr1.length;i++){
                    if(arr1[i]!=arr2[i]){
                        return arr2[i];
                    }
                }
            }
            return arr2[arr2.length-1];
    
            
        }
        public static void main(String[] args){
            String s="abcd";
            String t="abcde";
            char k=findTheDifference(s,t);
            System.out.println(k);
        }
    }
    

