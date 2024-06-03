class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingDouble(o->o[1]));
        int maxact=1;
        int lastact=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=lastact){
                maxact++;
                lastact=intervals[i][1];
            }
        }
        return intervals.length-maxact;
        
    }
}