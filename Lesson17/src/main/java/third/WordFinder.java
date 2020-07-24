package third;

import java.net.URL;
import java.util.HashSet;

public interface WordFinder {
    HashSet<String> getSentence(URL source);
    boolean checkWordInSentence(String sentence, String word);
    public void writeSetnenceToResult(String sentence);

}
