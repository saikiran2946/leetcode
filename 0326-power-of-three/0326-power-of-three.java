class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<32;i++){
            if(n==Math.pow(3,i)){
                return true;
            }
        }
        return false;
    }
}