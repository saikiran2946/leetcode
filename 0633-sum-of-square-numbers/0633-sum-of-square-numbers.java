class Solution {
    public boolean judgeSquareSum(int c) {
        long s=0;
        long l=(int)Math.sqrt(c);
        while(s<=l){
            long ans=s*s+l*l;
            if(ans==c) return true;
            else if(ans>c) l--;
            else s++;
        }
        return false;
    }
}