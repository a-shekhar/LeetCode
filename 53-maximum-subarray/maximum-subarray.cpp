class Solution {
public:
    int maxSubArray(vector<int>& nums) {
         int n = nums.size();
     int min = INT_MIN;
     int maxEnding = 0;
     
     for( int i =0 ; i< n ; i++)
     {
         maxEnding += nums[i];
     
     if( min < maxEnding)
     {
         min = maxEnding;
     }
     if( maxEnding < 0)
     {
         maxEnding = 0;
     }
     }
      return min;

    }
};