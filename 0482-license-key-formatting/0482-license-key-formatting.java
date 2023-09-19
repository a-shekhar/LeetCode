class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.toUpperCase().replace("-", "");
        StringBuilder build = new StringBuilder();
        int count = 0;
        for(int j = s.length()-1; j>=0; j--){
            build.insert(0, s.charAt(j));
            count++;
            if(j != 0 && count % k == 0){
                build.insert(0, "-");
            }
        }
        return build.toString();
    }
}