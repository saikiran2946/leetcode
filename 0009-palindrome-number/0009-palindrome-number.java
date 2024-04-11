class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y=0;
        int temp=x;
        while(temp!=0){
           int z=temp%10;
            y=y*10+z;
            temp=temp/10;
        }
        return (y==x);
        
    }
}