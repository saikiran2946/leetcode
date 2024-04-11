class Solution {
    public int majorityElement(int[] nums) {
        int votes=1;
        int majority_element=nums[0];
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                majority_element=nums[i];
                votes++;
            }
            else if(majority_element!=nums[i]){
                votes--;
            }
            else {
                votes++;
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==majority_element){
                count++;
            }
        }

        if(count>nums.length/2){
            return majority_element;
        }
     return 0;   
    }
}