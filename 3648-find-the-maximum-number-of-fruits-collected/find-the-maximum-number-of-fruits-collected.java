class Solution {
    int n;
    int t[][];

    public int child1(int[][] fruits) {
        int sum = 0;
        for (int i = 0; i < fruits.length; i++) {
            sum += fruits[i][i];
            t[i][i] = 0;
        }

        return sum;
    }

    public int child2(int i, int j, int[][] fruits) {
        if (i >= n || j >= n || i < 0 || j < 0)
            return 0;

        if (i >= j)
            return 0;

        if (i == n - 1 && j == n - 1)
            return 0;

        if (t[i][j] != -1)
            return t[i][j];

        int leftDiagonal = fruits[i][j]+child2(i + 1, j - 1, fruits);
        int rightDiagonal =fruits[i][j]+ child2(i + 1, j + 1, fruits);
        int down = fruits[i][j]+child2(i + 1, j, fruits);

        return t[i][j]=Math.max(leftDiagonal, Math.max(down, rightDiagonal));
    }

    public int child3(int i, int j, int[][] fruits) {
        if (i >= n || j >= n || i < 0 || j < 0)
            return 0;

        if (j >= i)
            return 0;

        if (i == n - 1 && j == n - 1)
            return 0;

        if (t[i][j] != -1)
            return t[i][j];

        int topDiagonal =fruits[i][j]+ child3(i - 1, j + 1, fruits);
        int rightDiagonal =fruits[i][j]+ child3(i + 1, j + 1, fruits);
        int right =fruits[i][j]+ child3(i, j+1, fruits);

        return t[i][j]=Math.max(topDiagonal, Math.max(right, rightDiagonal));
    }

    public int maxCollectedFruits(int[][] fruits) {
        n = fruits.length;
        t = new int[n][n];

        for (int[] i : t)
            Arrays.fill(i, -1);

        int firstChildScore = child1(fruits);

        int secondChildScore = child2(0, n - 1, fruits);

        int thirdChildScore = child3(n - 1, 0, fruits);

        System.out.println(firstChildScore);
        System.out.println(secondChildScore);
        System.out.println(thirdChildScore);

        return firstChildScore + secondChildScore + thirdChildScore;
    }
}