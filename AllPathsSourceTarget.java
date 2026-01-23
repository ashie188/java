import java.util.*;

public class AllPathsSourceTarget {

    static List<List<Integer>> list = new ArrayList<>();

    public static void dfs(int[][] graph, ArrayList<Integer> curr, int root, int target) {
        if (root == target) {
            list.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < graph[root].length; i++) {
            curr.add(graph[root][i]);
            dfs(graph, curr, graph[root][i], target);
            curr.remove(curr.size() - 1); // backtrack
        }
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<Integer> curr = new ArrayList<>();
        curr.add(0);
        dfs(graph, curr, 0, graph.length - 1);
        return list;
    }

    public static void main(String[] args) {
        // Example input:
        // graph = [[1,2],[3],[3],[]]
        int[][] graph = {
            {1, 2},
            {3},
            {3},
            {}
        };

        List<List<Integer>> result = allPathsSourceTarget(graph);

        System.out.println("All paths from source to target:");
        for (List<Integer> path : result) {
            System.out.println(path);
        }
    }
}