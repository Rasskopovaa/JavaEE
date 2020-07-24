package third;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;

public class WordFindeUser {
    WordFinder wordFinder;

    public WordFindeUser(WordFinder wordFinder) {
        this.wordFinder = wordFinder;
    }
    public void doWork(String recource, String word) throws MalformedURLException {
        HashSet<String> sentences = wordFinder.getSentence(new URL(recource));
    for( String sentence: sentences) {
        if (wordFinder.checkWordInSentence(sentence, word)) {
            wordFinder.writeSetnenceToResult(sentence);
        }
    }
    }
}
