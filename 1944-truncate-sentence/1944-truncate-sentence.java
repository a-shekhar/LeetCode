class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split("\\s+");
        
        StringBuilder ans = new StringBuilder("");
        
        for(int i = 0 ; i < k; i++){
            ans.append(arr[i] + " ");
        }
        return ans.toString().trim();
    }
}