class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        if(magazine.length() < ransomNote.length()){
            return false;
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
           arr[ransomNote.charAt(i) - 'a']++;
           arr[magazine.charAt(i) - 'a']--;
        }

        for(int i = ransomNote.length(); i < magazine.length(); i++){
           arr[magazine.charAt(i) - 'a']--;
        }


        for(int num : arr){
            if(num > 0){
                return false;
            }
        }

        return true;
    }
}