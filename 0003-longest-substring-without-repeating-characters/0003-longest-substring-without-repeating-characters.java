class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_length=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            char c1=s.charAt(right);
            if(map.containsKey(c1)){
                left=Math.max(left,map.get(c1)+1);
            }
            map.put(c1,right);
            max_length=Math.max(max_length,right-left+1);
        }
        return max_length;
        
        
    }
}