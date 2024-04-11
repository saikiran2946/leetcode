class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chain=1;
        int last=pairs[0][1];
        for(int i=0;i<pairs.length;i++)
        {
            if(last<pairs[i][0]){
                chain++;
                last=pairs[i][1];
            }
        }

        return chain;
    }
}