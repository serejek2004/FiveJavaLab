package ua.lviv.iot.algo.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextEditor {
    public String textEditor(final String stringToEdit,
                             final String[] fragments) {
        String editedString = stringToEdit;
        for (String currentFragment : fragments) {
            Pattern firstPattern = Pattern.compile("\\b\\w*\\.*"
                    + currentFragment + "\\.*\\w*\\b");
            Matcher firstMatcher = firstPattern.matcher(editedString);
            editedString = firstMatcher.replaceAll("");
        }
        return editedString;
    }

    public static void main(final String... args) {
        TextEditor textEditor = new TextEditor();
        String firstArg = args[0];
        String[] fragments = new String[args.length - 1];
        System.arraycopy(args, 1, fragments, 0, args.length - 1);
        System.out.println(textEditor.textEditor(firstArg, fragments));
    }
}
