class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0;
        int val1, val2;
        while(i < m || j < n){
            val1 = i < m ? Integer.valueOf(arr1[i]) : 0; 
            val2 = j < n ? Integer.valueOf(arr2[j]) : 0; 
            
            if(val1 < val2){
                return -1;
            }

            if(val1 > val2){
                return 1;
            }

            i++;
            j++;
        }

        return 0;
    }
}