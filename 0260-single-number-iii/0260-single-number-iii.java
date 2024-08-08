class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res=new int[2];
        List<Integer> arr=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums){
        if(map.getOrDefault(i,0)==1){
            arr.add(i);
        }
        }
            for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
            
            
    return res;
        
        
    }
}