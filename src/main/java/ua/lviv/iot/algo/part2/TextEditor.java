package ua.lviv.iot.algo.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextEditor {
    public String textEditor(String stringToEdit, String[] fragments) {
        for (String currentFragment : fragments) {
            Pattern firstPattern = Pattern.compile("\\b\\w*" + currentFragment + "\\w*\\b");
            Matcher firstMatcher = firstPattern.matcher(stringToEdit);
            stringToEdit = firstMatcher.replaceAll("");
        }
        return stringToEdit;
    }
}