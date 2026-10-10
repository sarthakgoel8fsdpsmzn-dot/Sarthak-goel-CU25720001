
class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String text = sentence.trim();
        int wordCount;

        if (text.isEmpty()) {
            wordCount = 0;
        } else {
            wordCount = text.split("\\s+").length;
        }

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Word Count: " + wordCount);
    }
}

public class question28 {
    public static void main(String[] args) {
        String sentence = "Java is a programming language";

        WordCounter w = new WordCounter();
        w.countWords(sentence);
    }
}
