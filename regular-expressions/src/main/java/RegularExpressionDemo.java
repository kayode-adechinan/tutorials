import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

    public static void main(String[] args) {

        // define a pattern to find
        Pattern myPatternToFind = Pattern.compile("^(.+)@(.+)$");

        // create a matcher
        Matcher myMatcher = myPatternToFind.matcher("kayode.adechinan@gmail.com");

        // check
        System.out.println(myMatcher.matches());

    }
}
