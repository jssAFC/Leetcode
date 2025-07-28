## Intuition
We have to calculate the total number of ways we can climb stairs where you can take 1 or 2 steps at a time.  
For example, if n = 3, we can climb in 3 ways:
- 1 + 1 + 1
- 2 + 1
- 1 + 2

Here, 1 and 2 are the base cases.

## Brute Force

We'll use recursion with our base cases being n = 1 and n = 2.

```java
class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
```

**Time Complexity:** O(2^n)  
**Space Complexity:** O(n) (recursive call stack)

## Optimal

We'll use memoization and maintain an array to keep record of the calculated values.

```java
class Solution {
    public int solve(int n, int[] dp) {
        if (n == 0 || n == 1 || n == 2) {
            return dp[n] = n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
    }
    
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
}
```

**Time Complexity:** O(n)  
**Space Complexity:** O(n) (for the dp array and recursive call stack)