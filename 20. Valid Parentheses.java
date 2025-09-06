import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2!=0){
            return false;
        }
        Stack <Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char temp=st.pop();
                if(c==')' && temp!='(' ||c=='}' && temp!='{' ||c==']' && temp!='['){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}