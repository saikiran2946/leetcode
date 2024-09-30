class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()==0){
            return "";
        }
        String longest=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(ispalindrome(sub) && sub.length()>longest.length()){
                    longest=sub;
                }
            }
        }
        return longest;
    }
    public boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}