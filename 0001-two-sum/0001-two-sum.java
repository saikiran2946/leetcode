class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        int[] res=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(m.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=m.get(target-nums[i]);
            }
            m.put(nums[i],i);
        }return res;
        
    }
}