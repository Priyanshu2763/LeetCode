class Solution {
    public int[]arr;
    public int t;
    public List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        arr=candidates;
        t=target;
        helper(new ArrayList<>(),0,0);
        return l;
    }
    
    public void helper(List<Integer>l1,int currsum,int currind){
        if(currsum>t)
        return;

        if(currsum==t){
            l.add(new ArrayList(l1));
            return;
        }


        for(int i=currind;i<arr.length;i++){
            l1.add(arr[i]);
            helper(l1,currsum+arr[i],i);
            l1.remove(l1.size()-1);   
           
        }

    }
}