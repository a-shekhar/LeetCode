class Solution {
    public int bitwiseComplement(int num) {
        if(num == 0){
            return 1;
        }
        if(num == 1){
            return 0;
        }
        String build = "";
        int rem = 0;
        int temp = 0;
        while(num > 0){
            rem = num % 2;
            temp = (rem == 1) ? 0 : 1;
            build = temp + build;
            num /= 2;
        }
        
        num = 0;
        int i = 0;
        for(int j = build.length() -1 ; j >= 0; j-- ){
            if(build.charAt(j) == '1'){
              num += Math.pow(2, i);
            }
            i++; 
        }
        return num;
    }
}