package ua.lviv.iot.algo.part2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextEditorTest {
    public String stringToEdit;
    public String expectedString;
    TextEditor testTextEditor = new TextEditor();

    @Test
    public void textEditorIfStringEmpty() {
        stringToEdit = "";
        String[] fragments = {"is", "oo&"};
        stringToEdit = testTextEditor.textEditor(stringToEdit, fragments);
        assertEquals(stringToEdit.length(), 0);
    }

    @Test
    public void textEditorIfStringHasFragments() {
        stringToEdit = "This animal looks so cool";
        expectedString = " animal  so ";
        String[] fragments = {"is", "oo"};
        stringToEdit = testTextEditor.textEditor(stringToEdit, fragments);
        assertEquals(expectedString, stringToEdit);
    }

    @Test
    public void textEditorIfStringHasNotFragments() {
        stringToEdit = "This animal looks so cool";
        String[] anyFragments = {"it", "ing"};
        assertEquals(testTextEditor.textEditor(stringToEdit, anyFragments), stringToEdit);
    }
}