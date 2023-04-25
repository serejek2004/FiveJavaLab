package ua.lviv.iot.algo.part2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextEditorTest {
    public String stringToEdit;
    public String firstFragment;
    public String secondFragment;
    public String expectedString;
    TextEditor testTextEditor = new TextEditor();

    @Test
    public void textEditorIfStringEmpty() {
        stringToEdit = "";
        firstFragment = "if";
        secondFragment = "ing";
        stringToEdit = testTextEditor.textEditor(stringToEdit, firstFragment, secondFragment);
        assertEquals(stringToEdit.length(), 0);
    }

    @Test
    public void textEditorIfStringHasFragments() {
        stringToEdit = "This animal looks so cool";
        firstFragment = "is";
        secondFragment = "oo";
        expectedString = " animal  so ";
        stringToEdit = testTextEditor.textEditor(stringToEdit, firstFragment, secondFragment);
        assertEquals(expectedString, stringToEdit);
    }

    @Test
    public void textEditorIfStringHasNotFragments() {
        stringToEdit = "This animal looks so cool";
        firstFragment = "it";
        secondFragment = "ing";
        expectedString = stringToEdit;
        stringToEdit = testTextEditor.textEditor(stringToEdit, firstFragment, secondFragment);
        assertEquals(expectedString, stringToEdit);
    }

}