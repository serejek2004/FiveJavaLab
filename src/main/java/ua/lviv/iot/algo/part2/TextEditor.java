package ua.lviv.iot.algo.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextEditor {
    public String textEditor(String stringToEdit, String firstFragment, String secondFragment) {
        Pattern firstPattern = Pattern.compile("\\b\\w*" + firstFragment + "\\w*\\b");
        Matcher firstMatcher = firstPattern.matcher(stringToEdit);
        stringToEdit = firstMatcher.replaceAll("");

        Pattern secondPattern = Pattern.compile("\\b\\w*" + secondFragment + "\\w*\\b");
        Matcher secondMatcher = secondPattern.matcher(stringToEdit);
        stringToEdit = secondMatcher.replaceAll("");

        return stringToEdit;
    }
}
