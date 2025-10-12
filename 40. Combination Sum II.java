class Solution {
    public List<List<Integer>> l=new ArrayList<>();
    public int []arr;
    public int t;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        t=target;
        arr=candidates;
        Arrays.sort(arr);
        helper(new ArrayList<>(),0,0);
        return l;
    }
    public void helper(ArrayList<Integer>l1,int cs,int ci){
        if(cs>t)
        return;
        if(cs==t){
            l.add(new ArrayList(l1));
            return;
        }
        for(int i=ci;i<arr.length;i++){
            if (i > ci && arr[i] == arr[i - 1])
    continue;
            l1.add(arr[i]);
            helper(l1,cs+arr[i],i+1);
            l1.remove(l1.size()-1);
        }
    }
}