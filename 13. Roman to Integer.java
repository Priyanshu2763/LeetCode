class Solution {
    public int values(char c){
        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return -1;
    }
    public int romanToInt(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int a=values(s.charAt(i));
            if(i<n-1 && a<values(s.charAt(i+1))){
                ans-=a;
            }else{
                ans+=a;
            }
        }
        return ans;
    }
}