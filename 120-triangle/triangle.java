class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                list.add(null);
            }
            dp.add(list);
        }
        return solve(triangle,dp, 0, 0);

    }

    public int solve(List<List<Integer>> arr, List<List<Integer>> dp, int i, int j) {
        if (i >= arr.size())
            return 0;

        if (dp.get(i).get(j) != null)
            return dp.get(i).get(j);

        int res=arr.get(i).get(j) + Math.min(solve(arr, dp, i + 1, j), solve(arr, dp, i + 1, j + 1));
        dp.get(i).set(j,res);
        return res;
    }
}