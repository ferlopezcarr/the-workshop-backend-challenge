package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.java.ReplacementExercise;
import org.junit.jupiter.api.Test;


public class ReplacementExerciseTest {

  /**
  *     String src = “Hello, hello!”
  *     String o = “lo”
  *     String n = “1234”
  */
  @Test
  public void itShouldReplaceOcurrenceWithText() {
    // Given
    String src = "Hello, hello!";
    String textToReplace = "lo";
    String replacementText = "1234";

    // When
    String textWithReplacement = ReplacementExercise.replace(src, textToReplace, replacementText);

    // Then
    String expectedResult = "Hel1234, hel1234!";
    assertEquals(textWithReplacement, expectedResult);
  }


}