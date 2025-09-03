class Solution {

    public void backtrack(String digits,int ind,StringBuilder sb){
        if(ind==digits.length()){
            l.add(sb.toString());
            return ;
        }

        String s=m.get(digits.charAt(ind));
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            backtrack(digits,ind+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }

    public HashMap <Character,String> m=new HashMap<>();
    public List<String>l=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        return l;
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");

        backtrack(digits,0,new StringBuilder());
        return l;
    }
}