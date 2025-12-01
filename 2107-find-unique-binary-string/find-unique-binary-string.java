class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();
        solve(set, new StringBuilder(), nums[0].length());
        Set<String> numsSet = new HashSet<>();
        
        numsSet.addAll(Arrays.asList(nums));

        for(String num : set){
            if(!numsSet.contains(num)) return num;
        }
        return "";
    }

    public void solve(Set<String> set, StringBuilder builder, int n){
        if(builder.length() == n){
            set.add(builder.toString());
            return;
        }

        int len = builder.length();
        
        solve(set, builder.append("0"), n);
        builder.setLength(len);
        solve(set, builder.append("1"), n);
        builder.setLength(len);
       
    }
  
}