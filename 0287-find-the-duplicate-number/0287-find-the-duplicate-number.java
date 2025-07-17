class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        // find intersection
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while (slow != fast);
        
        // find intersection point
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}