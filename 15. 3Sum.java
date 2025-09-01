class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>l=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    l.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;k--;
                    while(nums[j]==nums[j-1]&& j<k){j++;}
                    while(nums[k]==nums[k+1] && j<k){k--;}
                }

            }
        }
        return l;

    }
}