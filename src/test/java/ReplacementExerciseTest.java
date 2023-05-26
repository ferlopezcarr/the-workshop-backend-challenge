package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import main.java.ReplacementExercise;
import org.junit.jupiter.api.Test;


public class ReplacementExerciseTest {

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

  @Test
  public void itShouldThrowIllegalArgumentExceptionWithNullSrcText() {
    // Given
    String src = null;
    String textToReplace = "lo";
    String replacementText = "1234";

    // When & Then
    assertThrows(IllegalArgumentException.class, () -> {
      ReplacementExercise.replace(src, textToReplace, replacementText);
    });
  }

  @Test
  public void itShouldThrowIllegalArgumentExceptionWithNullTextToReplace() {
    // Given
    String src = "Hello, hello!";
    String textToReplace = null;
    String replacementText = "1234";

    // When & Then
    assertThrows(IllegalArgumentException.class, () -> {
      ReplacementExercise.replace(src, textToReplace, replacementText);
    });
  }

  @Test
  public void itShouldThrowIllegalArgumentExceptionWithNullReplacementText() {
    // Given
    String src = "Hello, hello!";
    String textToReplace = "lo";
    String replacementText = null;

    // When & Then
    assertThrows(IllegalArgumentException.class, () -> {
      ReplacementExercise.replace(src, textToReplace, replacementText);
    });
  }

  @Test
  public void itShouldThrowIllegalArgumentExceptionWithNEmptySrcText() {
    // Given
    String src = "";
    String textToReplace = "lo";
    String replacementText = "1234";

    // When & Then
    assertThrows(IllegalArgumentException.class, () -> {
      ReplacementExercise.replace(src, textToReplace, replacementText);
    });
  }

  @Test
  public void itShouldThrowIllegalArgumentExceptionWithEmptyTextToReplace() {
    // Given
    String src = "Hello, hello!";
    String textToReplace = "";
    String replacementText = "1234";

    // When & Then
    assertThrows(IllegalArgumentException.class, () -> {
      ReplacementExercise.replace(src, textToReplace, replacementText);
    });
  }

  @Test
  public void itShouldReplaceOcurrenceWithEmptyText() {
    // Given
    String src = "Hello, hello!";
    String textToReplace = "lo";
    String replacementText = "";

    // When
    String textWithReplacement = ReplacementExercise.replace(src, textToReplace, replacementText);

    // Then
    String expectedResult = "Hel, hel!";
    assertEquals(textWithReplacement, expectedResult);
  }

  @Test
  public void itShouldNotReplaceAnythingWithNoOccurrences() {
    // Given
    String src = "Hell, hell!";
    String textToReplace = "lo";
    String replacementText = "";

    // When
    String textWithReplacement = ReplacementExercise.replace(src, textToReplace, replacementText);

    // Then
    assertEquals(textWithReplacement, src);
  }

}