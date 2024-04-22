package oop.labor09.Lab9_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(DictionaryType dictionaryType) {
        this.dictionary = DictionaryProvider.createDictionary(dictionaryType);
    }

    public boolean searchWord(String word) {
        return dictionary.search(word);
    }

    public List<String> searchAllWords(File textFile) {
        return dictionary.searchAllWords(textFile);
    }

    public List<String> loadWordsFromFile(String filename) {
        List<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                words.add(scanner.nextLine().trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }
}

