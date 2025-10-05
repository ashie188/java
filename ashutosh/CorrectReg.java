import java.util.regex.*;

public class CorrectReg {

    public static boolean isValidRegex(String regex) {
        try {
            Pattern.compile(regex);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String regex1 = "[a-z]+";
        String regex2 = "[a-z*"; // This is an incorrect regular expression

        System.out.println("Regex 1 is valid: " + isValidRegex(regex1));
        System.out.println("Regex 2 is valid: " + isValidRegex(regex2));
    }
}
