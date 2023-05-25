package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReplacementExercise {
  
  /**
   * String replacement
   */
  public static String replace(String source, String textToReplace, String replaceText) {
    if (source == null ||  textToReplace == null || replaceText == null) {
      throw new IllegalArgumentException("You provide a null parameters");
    }
    if (source.isEmpty() ||  textToReplace.isEmpty() || replaceText.isEmpty()) {
      throw new IllegalArgumentException("You provide a empty string");
    }

    String replacedText = source;
    int fromIndexToReplace = replacedText.indexOf(textToReplace);
    boolean areTextReplacementMissing = true;
    while (areTextReplacementMissing) {
        int toIndex = textToReplace.length();
        String firstReplacement = replacedText.substring(0, fromIndexToReplace);
        String restOfTheText = replacedText.substring(toIndex, replacedText.length());
        replacedText = firstReplacement + textToReplace + restOfTheText;
        areTextReplacementMissing = restOfTheText.indexOf(textToReplace) > 0;
    }

    return replacedText;
  }

}