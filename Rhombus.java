import java.util.*;

public class Rhombus {

    public static int[] getBiggestThree(int[][] grid) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){

                int val = grid[i][j];

                if(!set.contains(val)){
                    set.add(val);
                    minheap.add(val);

                    if(minheap.size() > 3){
                        minheap.poll();
                    }
                }

                int k = 1;

                while(true){

                    if(i-k < 0 || i+k >= grid.length || j-k < 0 || j+k >= grid[0].length){
                        break;
                    }

                    int sum = grid[i-k][j] + grid[i+k][j] + grid[i][j-k] + grid[i][j+k];

                    if(!set.contains(sum)){
                        set.add(sum);
                        minheap.add(sum);

                        if(minheap.size() > 3){
                            minheap.poll();
                        }
                    }

                    k++;
                }
            }
        }

        int size = minheap.size();
        int[] ans = new int[size];

        for(int i = size-1; i >= 0; i--){
            ans[i] = minheap.poll();
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {3,4,5,1,3},
            {3,3,4,2,3},
            {20,30,200,40,10},
            {1,5,5,4,1},
            {4,3,2,2,5}
        };

        int[] result = getBiggestThree(grid);

        System.out.println(Arrays.toString(result));
    }
}