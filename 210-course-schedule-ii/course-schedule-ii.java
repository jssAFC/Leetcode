class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        int V = numCourses;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < V; i++)
            list.add(new ArrayList<>());

        int[] dependency = new int[V];

        for (int edge[] : pre) {
            int u = edge[0];
            int v = edge[1];
            dependency[u] += 1;
            list.get(v).add(u);
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (dependency[i] == 0)
                q.offer(i);
        }

        if(q.isEmpty()) return new int[]{};

        ArrayList<Integer> result = new ArrayList<>();

        int[] array = new int[numCourses];
        int index=0;

        while (!q.isEmpty()) {
            int top = q.poll();

            for (int num : list.get(top)) {
                dependency[num] -= 1;
                if (dependency[num] == 0)
                    q.offer(num);
            }
            array[index++]=top;
        }

        boolean flag=true;
        for(int i:dependency) if(i!=0){
            return new int[]{};
        }

        return array;

    }
}