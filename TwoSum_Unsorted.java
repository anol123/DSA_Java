class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] index = new int[2];
        // for(int i=0; i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             index[0] = i;
        //             index[1] = j;
        //             return index;
        //         }
        //     }

        // }
        // return index;

        //Using HashMap

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int needed = target - nums[i];
            if (map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};

    }
}