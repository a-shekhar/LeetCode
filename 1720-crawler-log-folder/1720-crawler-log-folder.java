class Solution {
    public int minOperations(String[] logs) {
        int main = 0;
        for(String log: logs){
            if(log.endsWith("../") && main > 0){
                main -= 1;
            }else if(log.endsWith("./")){
                main += 0;
            }else{
                main += 1;
            }
        }
        return main;
    }
}