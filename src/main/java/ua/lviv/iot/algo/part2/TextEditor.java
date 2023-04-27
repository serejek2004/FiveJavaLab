package ua.lviv.iot.algo.part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class TextEditor {
    public String textEditor(String stringToEdit, String[] fragments) {
        for (String currentFragment : fragments) {
            Pattern patternForDelFragments = Pattern.compile("\\b\\w*" + currentFragment + "\\w*\\b");
            Matcher matcherForDelFragments = patternForDelFragments.matcher(stringToEdit);
            stringToEdit = matcherForDelFragments.replaceAll("");
        }
        return stringToEdit;
    }
}