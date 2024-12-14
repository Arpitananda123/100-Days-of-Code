
import java.util.Stack;
public class Day10 {
        public static boolean isValid(String s){
            Stack<Character> st=new Stack<Character>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                    st.push(s.charAt(i));
                }else{
                    if(st.isEmpty()){
                        return false;
                    }else{
                        char top=st.peek();
                        if(s.charAt(i)==')' && top=='(' || s.charAt(i)=='}' && top =='{' || s.charAt(i)==']' && top =='['){
                            st.pop();
                        }else{
                            return false;
                        }
                    }
                }
            }
            if(st.isEmpty()){
                return true;
            }else{
                return false;
            }
        }

        public static void main(String[] args){
            String m= "()[]{}";
            Boolean ans=isValid(m);
            System.out.println(ans);
        }
    
    
}
