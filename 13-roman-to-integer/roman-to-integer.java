class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        if(s.length() == 1){
            return romanMap.get(s.charAt(0));
        }

        int n = s.length();
        int sum = 0;
        int i = 0;
        for(i = n - 1;  i > 0; i--){
            if(romanMap.get(s.charAt(i-1)) < romanMap.get(s.charAt(i))){
                sum += (romanMap.get(s.charAt(i)) - romanMap.get(s.charAt(i-1)));
                i--;
            } else {
                sum += romanMap.get(s.charAt(i));
            }
        }

        //System.out.println(i);
        if(i >= 0){
            sum += romanMap.get(s.charAt(0));
        }

        return sum;
    }
}