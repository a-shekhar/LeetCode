class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        int sum = 0;
        for(int i = 1; i < n-1; i++){
            sum += salary[i];
        }
        return (double) sum/(n-2);
    }
}