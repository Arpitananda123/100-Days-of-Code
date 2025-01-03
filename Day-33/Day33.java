import java.util.ArrayList;
import java.util.List;

public class Day33 {
        public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int res = 0;
            
            for(int i = 0 ;i<items.size();i++){
                if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
                if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
                if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
            }
            
            return res;
            
        }


        public static void main(String[] args) {
            List<List<String>> items = new ArrayList<>();
            items.add(new ArrayList<>(List.of("phone", "blue", "pixel")));
            items.add(new ArrayList<>(List.of("computer", "silver", "lenovo")));
            items.add(new ArrayList<>(List.of("phone", "gold", "iphone")));
            String ruleKey = "color";
            String rulwValue = "gold";
            int ans = countMatches(items, ruleKey, rulwValue);
            System.out.println(ans);
        }

    
    
}
