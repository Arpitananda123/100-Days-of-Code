import java.util.ArrayList;
public class Day46 {
    public static int countDigits(int num) {
        ArrayList<Integer> arr=new ArrayList<>();
        int a=num;
        while(num!=0){
            int k=num%10;
            arr.add(k);
            num/=10;
        }
        Integer[] ans = new Integer[arr.size()];
        ans = arr.toArray(ans);
        int count=0;
        for(int i=0;i<ans.length;i++){
            if(a%ans[i]==0){
                count+=1;
            }
        }
        return count;
        
    }
    public static void main(String[] args){
        int n=1284;
        System.out.println(countDigits(n));
    }
}