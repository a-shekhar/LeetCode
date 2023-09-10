class Solution {
    public String modifyString(String s) {
        Random rand = new Random();
        char[] arr = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '?'){
                continue;
            }
    
        int num1 = i - 1 < 0 ? 0 : (int) arr[i-1];
        int num2 = i + 1 > s.length() - 1 ? 0 : (int) arr[i+1];
        
        int num = num1;
        while(num == num1 || num == num2){
            num = rand.nextInt(97, 122);
        }
        arr[i] = (char) num;  
        }
        return new String(arr);
    }
}