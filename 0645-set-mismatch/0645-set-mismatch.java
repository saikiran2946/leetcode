class Solution {
    public int[] findErrorNums(int[] nums) {
        int d=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                d=nums[i];
                nums[i]=0;
            }
        }
    
        int sum=(n*(n+1))/2;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        sum=sum-total;
        return new int[]{d,sum};
        
    }
}