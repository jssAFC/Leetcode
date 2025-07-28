## Brute Force

In this approach, we use recursion. For every number, we make a recursive call.

```java
class Solution {
    public int fib(int n) {
        if(n<=1) return n;

        return fib(n-1) +fib(n-2);
    }
}
```

**Time Complexity:** O(2^n)  
**Space Complexity:** O(n)  


## Optimal Approach

In this approach, we use either memoization or tabulation.

### 1) Memoization

We create an array to store the value of each computed n to avoid redundant calculations.

```java
class Solution {
    public int fibonacci(int n, int dp[]) {
        if(n == 0 || n == 1) return dp[n] = n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
    }
    
    public int fib(int n) {
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        return fibonacci(n, arr);
    }
}
```

### 2) Tabulation

We create an array and fill it iteratively without recursion.

```java
class Solution {
    public int fib(int n) {
        int dp[] = new int[n + 1];
        if(n == 0 || n == 1) return n;
        
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
}
```