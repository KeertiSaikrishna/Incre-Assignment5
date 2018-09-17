import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternCheck {
    public static void main(String[] args) {
        String str = "This is simple example to check wheather a sentence starts " +
                "with capital letter and ends with a period.";
        //taking a sample string as input
        Pattern p = Pattern.compile("^[A-Z].*\\.$");
        Matcher m = p.matcher(str);
        // creating a pattern to check whether the string matches the required condition

        if (m.find())
            System.out.println("given string matches the pattern");
        else
            System.out.println("given string does not match the pattern");
        // printing the result
    }
}
