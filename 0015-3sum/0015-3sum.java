class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (nums.length < 3) return result;
        
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        Arrays.sort(nums);
        if (nums[0] > 0) return result;

        for (int i = 0; i < nums.length; i++ ) hashMap.put(nums[i], i); 

        for (int i = 0; i < nums.length - 2; i++ ) {
            if (nums[i] > 0) break;

            for (int j = i + 1; j < nums.length - 1; j++ ) {
                int required = 0 - nums[i] - nums[j];
                if (hashMap.containsKey(required) && hashMap.get(required)>i && hashMap.get(required)>j) {
                    result.add(Arrays.asList(nums[i], nums[j], required));
                } 
                j = hashMap.get(nums[j]);
            } 
            i = hashMap.get(nums[i]);
        }  

        return result;
        
    }
}