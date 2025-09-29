class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int candidate1 = arr[0];
        int count1 = 0;
        int count2 = 0;
        int candidate2 = arr[0];
        for(int num : arr){
            if(num == candidate1){
                count1++;
            } else if(num == candidate2){
                count2++;
            } else if(count1 == 0){
                candidate1 = num;
                count1++;
            }else if(count2 == 0){
                candidate2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int[] nums = new int[2];
        for(int num : arr){
            if(num == candidate1){
                nums[0]++;
            } else if(num == candidate2){
                nums[1]++;
            }
        }


        ArrayList<Integer> list = new ArrayList<>();

        if(nums[0] > arr.length/3){
            list.add(candidate1);
        }

        if(nums[1] > arr.length/3){
            list.add(candidate2);
        }

        Collections.sort(list);
        
        return list;
    }
}