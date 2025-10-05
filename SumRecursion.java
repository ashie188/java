public class SumRecursion {


    public int findSum(int[] arr, int l) {
        if (l == 0) {
            return arr[0];
        } else {
            return arr[l] + findSum(arr, l - 1); 
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5}; 
        int length = A.length - 1;

        SumRecursion obj = new SumRecursion();   
        int sum = obj.findSum(A, length);  
        System.out.println("The sum is " + sum);
    }
}
      