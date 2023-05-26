package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReplacementExercise {

    /**
     *  Replace all occurrences of a text in a string with another text.
     *  Example:
     *      source: “Hello, hello!”
     *      textToReplace: “lo”
     *      replaceText: “1234”
     *      returns: “Hel1234, hel1234!”
     */
    public static String replace(String source, String textToReplace, String replaceText) {
        if (source == null ||  textToReplace == null || replaceText == null) {
            throw new IllegalArgumentException("You provide a null parameters");
        }
        if (source.isEmpty() ||  textToReplace.isEmpty()) {
            throw new IllegalArgumentException("You provide a empty string");
        }

        String result = source;
        int fromIndexToReplace = result.indexOf(textToReplace);
        int currentIndex = fromIndexToReplace;
        boolean areTextReplacementMissing = fromIndexToReplace > 0;
        while (areTextReplacementMissing) {
            int toIndex = fromIndexToReplace + textToReplace.length();
            String textBeforeCurrentReplacement = result.substring(0, fromIndexToReplace);
            String restOfTheText = result.substring(toIndex, result.length());
            result = textBeforeCurrentReplacement + replaceText + restOfTheText;
            currentIndex = fromIndexToReplace + replaceText.length();

            int replacementRelativeIndexFound = restOfTheText.indexOf(textToReplace);
            areTextReplacementMissing = replacementRelativeIndexFound > 0;
            fromIndexToReplace = currentIndex + replacementRelativeIndexFound;
        }

        return result;
    }

}