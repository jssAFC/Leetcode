class Solution {
    int n;
    int[][] t;

    int first(int[][] fruits) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += fruits[i][i];
            t[i][i] = 0;
        }

        return sum;
    }

    public int second(int i, int j, int fruits[][]) {

        if (i < 0 || j < 0 || i >= n || j >= n)
            return 0;

        if (i == n - 1 && j == n - 1)
            return 0;

        if (i >= j)
            return 0;
        if (t[i][j] != -1)
            return t[i][j];


        int bottomLeft = fruits[i][j] + second(i + 1, j - 1, fruits);
        int down = fruits[i][j] + second(i + 1, j, fruits);
        int bottomRight = fruits[i][j] + second(i + 1, j + 1, fruits);

        return t[i][j] = Math.max(down, Math.max(bottomLeft, bottomRight));
    }

    public int third(int i, int j, int fruits[][]) {

        if (i < 0 || j < 0 || i >= n || j >= n)
            return 0;

        if (i == n - 1 && j == n - 1)
            return 0;

        if (i <= j)
            return 0;
        if (t[i][j] != -1)
            return t[i][j];


        int topRight = fruits[i][j] + third(i - 1, j + 1, fruits);
        int right = fruits[i][j] + third(i, j + 1, fruits);
        int bottomRight = fruits[i][j] + third(i + 1, j + 1, fruits);

        return t[i][j] = Math.max(right, Math.max(topRight, bottomRight));
    }

    public int maxCollectedFruits(int[][] fruits) {

        n = fruits.length;
        t = new int[n][n];

        for (int[] row : t)
            Arrays.fill(row, -1);

        int child1 = first(fruits);

        int child2 = second(0, n - 1, fruits);

        int child3 = third(n - 1, 0, fruits);

        return child1 + child2 + child3;
    }
}