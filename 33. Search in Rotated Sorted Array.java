class Solution {
    public int search(int[] nums, int target) {
        int s=0,e=nums.length-1,mid;
        int n=-1;
        while(s<=e){
            mid=(s+e)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[s]<=nums[mid]){
                if(nums[s]<=target && nums[mid]>=target){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }else {
                if(nums[mid]<=target && nums[e]>=target){
                    s=mid+1;
                }else{
                    e=mid-1;
                }

            }
        }


        return n;
    }
}