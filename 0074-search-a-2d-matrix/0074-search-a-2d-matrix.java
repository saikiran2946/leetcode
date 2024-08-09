class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int right=m*n-1;
            
        while(left<=right){
            int mid=(left+right)/2;
            int r=mid/n;
            int c=mid%n;
            if(target==matrix[r][c]) return true;
            if(target>matrix[r][c]) left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}