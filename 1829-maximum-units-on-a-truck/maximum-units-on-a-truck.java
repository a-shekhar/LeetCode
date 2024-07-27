class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Comparator<int[]> comparator = new Comparator<>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o2[1] - o1[1];
            }
        };
        Arrays.sort(boxTypes, comparator);
        int totalWeight = 0;
        int totalValue = 0;
        for(int[] boxType : boxTypes) {
            System.out.println(Arrays.toString(boxType));
            if(totalWeight + boxType[0] <= truckSize){
                totalValue += (boxType[0] * boxType[1]);
                totalWeight += boxType[0];
            }else{
                totalValue += ((truckSize - totalWeight) * boxType[1]);
                break;
            }
        }
        return totalValue;
    }
}