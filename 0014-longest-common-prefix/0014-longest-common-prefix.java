class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcp = strs[0];
        for(int i = 1;i< strs.length;i++){
              while( strs[i].indexOf(lcp) != 0 ){
                  lcp = lcp.substring(0, lcp.length()-1);
                  if(lcp.equals(""))
                     return "";
              }
        }
        return lcp;
    }
}