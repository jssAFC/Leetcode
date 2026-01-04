class Solution {
    List<String> rowSequence = new ArrayList<>();
    public static final int M = 1000000007;
    int[][]dp;

    public void generateRowSequence(String str, String prev, int i) {
        if (i == 3) {
            rowSequence.add(str);
            return;
        }

        String[] colors = { "R", "G", "Y" };
        for (String s : colors) {
            if (s.equals(prev))
                continue;
            generateRowSequence(str + s, s, i + 1);
        }
    }

    public int solve(int remRows, int prevIndex) {
        if (remRows == 0)
            return 1;

        if(dp[remRows][prevIndex]!=-1) return dp[remRows][prevIndex];
        int ways = 0;
        String prevState = rowSequence.get(prevIndex);

        for (int i = 0; i < rowSequence.size(); i++) {
            if (i == prevIndex)
                continue;

            String currState = rowSequence.get(i);
            boolean valid = true;
            // System.out.println(currState);
            for (int j = 0; j < 3; j++) {
                if (prevState.charAt(j) == currState.charAt(j)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ways = (ways + solve(remRows - 1, i)) % M;
            }

        }
        return dp[remRows][prevIndex]=ways;
    }

    public int numOfWays(int n) {
        generateRowSequence("", "#", 0);
        dp=new int[n][rowSequence.size()+1];

        for(int []arr:dp) Arrays.fill(arr,-1);
        
        int result = 0;

        for (int i = 0; i < rowSequence.size(); i++) {
            result = (result + solve(n - 1, i)) % M;
        }

        return result;
    }
}