class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> beams = new ArrayList<>();
        for(String b : bank){
            int count = 0;
            for(int i = 0; i < b.length(); i++){
                if(b.charAt(i) == '1'){
                    count++;
                }
            }

            if(count > 0){
                beams.add(count);
            }
        }

        int lasers = 0;
        int i = 0;
        while(i < beams.size() - 1){
            lasers += beams.get(i) * beams.get(i+1);
            i++;
        }

        return lasers;
    }
}