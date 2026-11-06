
import java.util.*;

public class FizzBuzzProblem {

    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 15;

        FizzBuzzProblem solution = new FizzBuzzProblem();

        List<String> result = solution.fizzBuzz(n);

        System.out.println(result);
    }
}
