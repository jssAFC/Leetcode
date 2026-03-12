class Solution {
    int V;

    public boolean isBipartite(int[][] graph) {
        V = graph.length;
        int colors[] = new int[V];
        Arrays.fill(colors, -1);
        int color = 0;

        for (int i = 0; i < V; i++) {
            if (colors[i] == -1 && !isCycle(graph, i, -1, color, colors)) {
                return false;
            }
        }

        return true;
    }

    public boolean isCycle(int[][] graph, int i, int parent, int color, int[] colors) {
        colors[i]=color;
        for (int u : graph[i]) {
            if (colors[u] == -1) {
                if (isCycle(graph, u, i, 1 - color, colors) == false)
                    return false;
            } else {
                if (colors[u] == color)
                    return false;
            }

        }

        return true;
    }
}