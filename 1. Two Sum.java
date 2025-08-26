class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(m.containsKey(res)){
                return new int[]{m.get(res),i};
            }
            m.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

}
