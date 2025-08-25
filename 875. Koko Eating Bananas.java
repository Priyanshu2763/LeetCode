class Solution {

    public long req(int[]piles,int s){
         long total = 0;
    for(int e : piles){
        total += (e + s - 1) / s;  // Integer ceil trick: avoids floating-point
    }
    return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int e:piles){
            max=Math.max(e,max);
        }
    
        int s=1,e=max,mid,ans=Integer.MAX_VALUE;
        while(s<=e){
            mid=(s+e)/2;
            long reqh=req(piles,mid);
            if(reqh<=h){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}