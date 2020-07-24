package third;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


public class WordFinderTest {
    final static String FIRST_SENTENCE ="One";
    final static String SECOND_SENTENCE ="Two";
    final static String THIRD_SENTENCE ="Three";

    private WordFindeUser wordFindeUser;
    private WordFinder wordFinder = Mockito.mock(WordFinder.class);

 @BeforeEach
    void prepareTest(){
     wordFindeUser = new WordFindeUser(wordFinder);

 }
 @Test
 public void wordFinderEmptyList(){
     when(wordFinder.getSentence(any())).thenReturn(new HashSet<>());
     try {
         wordFindeUser.doWork("file://some","word");
     } catch (MalformedURLException e) {
         e.printStackTrace();
     }
verify(wordFinder, times(0)).checkWordInSentence(any(),any());
     verify(wordFinder,times(0)).writeSetnenceToResult(any());
 }
 @Test
    public void wordFinderAllMatches(){
     when(wordFinder.getSentence(any())).thenReturn(new HashSet<>(
         Arrays.asList(FIRST_SENTENCE,SECOND_SENTENCE,THIRD_SENTENCE)));
     when(wordFinder.checkWordInSentence(any(),any())).thenReturn(true);
     try {
         wordFindeUser.doWork("file://some","word");
     } catch (MalformedURLException e) {
         e.printStackTrace();
     }
     verify(wordFinder,times(1)).writeSetnenceToResult(FIRST_SENTENCE);
 }
    @Test
    public void wordFinderNoMatches(){
        when(wordFinder.getSentence(any())).thenReturn(new HashSet<>(
                Arrays.asList(FIRST_SENTENCE,SECOND_SENTENCE,THIRD_SENTENCE)));
        when(wordFinder.checkWordInSentence(any(),any())).thenReturn(false);
        try {
            wordFindeUser.doWork("file://some","word");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        verify(wordFinder,times(0)).writeSetnenceToResult(any());
    }

 }


