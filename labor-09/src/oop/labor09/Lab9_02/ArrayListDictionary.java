package oop.labor09.Lab9_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Implementation of IDictionary using ArrayList
public class ArrayListDictionary implements IDictionary {
    private static ArrayListDictionary instance;
    private ArrayList<String> words;

    private ArrayListDictionary() {
        words = new ArrayList<>();
    }

    public static ArrayListDictionary getInstance() {
        if (instance == null) {
            instance = new ArrayListDictionary();
        }
        return instance;
    }

    @Override
    public boolean search(String word) {
        return Collections.binarySearch(words, word) >= 0;
    }

    @Override
    public List<String> searchAllWords(File textFile) {
        List<String> wordsFromFile = new ArrayList<>();
        try (Scanner scanner = new Scanner(textFile)) {
            while (scanner.hasNextLine()) {
                wordsFromFile.add(scanner.nextLine().trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.words.addAll(wordsFromFile);
        return wordsFromFile;
    }
}