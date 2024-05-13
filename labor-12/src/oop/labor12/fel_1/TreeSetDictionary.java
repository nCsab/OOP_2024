package oop.labor12.fel_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDictionary implements IDictionary {
    private static TreeSetDictionary instance;
    private TreeSet<String> words = new TreeSet<>();

    private TreeSetDictionary() {
        try (Scanner scanner = new Scanner(new File(DICTIONARY_FILE))) {
            while (scanner.hasNextLine()) {
                add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static IDictionary newInstance() {
        if (instance == null) {
            instance = new TreeSetDictionary();
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
        if (!words.contains(word)) {
            return false;
        } else return true;
    }

    @Override
    public int size() {
        return words.size();
    }
}
