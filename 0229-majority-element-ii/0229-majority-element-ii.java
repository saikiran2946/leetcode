class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map.get(i)>n/3){
                if(!res.contains(i))
                    res.add(i);
                
            }
        }return res;
        
    }
}