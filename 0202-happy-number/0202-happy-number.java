class Solution {
public boolean isHappy(int n) {
        List<Integer> visited = new ArrayList<>();
        while(true){
            int num = n;
            int sum = 0;
            while(num > 0){
                int rem = num % 10;
                sum += Math.pow(rem, 2);
                num /= 10;
            }
            if(visited.contains(sum)){
                break;
            }
            visited.add(sum);
            n = sum;
            
        }
        return  n == 1;
    }}