package oop.labor12.fel_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Implementation of IDictionary using ArrayList
public class ArrayListDictionary implements IDictionary {
    private static ArrayListDictionary instance;
    private ArrayList<String> words=new ArrayList<>();

    private ArrayListDictionary() {
        try (Scanner scanner = new Scanner(new File(DICTIONARY_FILE))) {
            while (scanner.hasNextLine()) {
                add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }}

    public static IDictionary newInstance() {
        if (instance == null) {
            instance = new ArrayListDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String word) {
        if (!find(word)) {
            words.add(word);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String word) {
        if (Collections.binarySearch(words, word) == -1) {
            return false;
        } else return true;
    }

    @Override
    public int size() {
        return words.size();
    }
}