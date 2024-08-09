class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.getOrDefault(i,0)!=1){
                return i;
            }
        }return -1;
        
    }
}