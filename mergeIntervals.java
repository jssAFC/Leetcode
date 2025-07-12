class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int []temp=intervals[0];
        for (int i = 1; i < intervals.length ; i++) {
            if(temp[1]>=intervals[i][0]){
                temp[1]=Math.max(temp[1],intervals[i][1]);
            }
            else{
                list.add(temp);
                temp=intervals[i];
            }
        }
        list.add(temp);

        return list.toArray(new int[list.size()][]);
    }
}