

public class Day19 {
        public static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
    
            while (left <= right) {
                int mid = (left + right) / 2;
    
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] >= nums[left]) {
                    if (nums[left] <= target && target <= nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (nums[mid] <= target && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
    
            return -1;        
        }

        public static void main(String[] args){
            int[] nums=new int[]{4,5,6,7,0,1,2};
            int target=0;
            int ans=search(nums,target);
            System.out.println(ans);
        }
    
    
}
