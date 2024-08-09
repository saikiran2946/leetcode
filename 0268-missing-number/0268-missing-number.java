class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.getOrDefault(i,0)==0){
                return i;
            }
        }return nums.length;
        
        
    }
}