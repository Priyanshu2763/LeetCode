class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1,mid,lb=-1;
        while(s<=e){
            mid=(s+e)/2;
            if(mid==e){
                lb=mid+1;

            }
            if(nums[mid]>=target){
                lb=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return lb;
    }
}