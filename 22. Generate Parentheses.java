class Solution {

    public List<String>l=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(new StringBuilder(),n,0);
        return l;

    }
    public void backtrack(StringBuilder sb,int n,int close){
        if(n==0 && close==0){
            l.add(sb.toString());
            return ;
        }

        if(n>0){
            sb.append('(');
            backtrack(sb,n-1,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close>0){
            sb.append(')');
            backtrack(sb,n,close-1);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}