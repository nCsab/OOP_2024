package oop.labor12.fel_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HashSetDictionary implements IDictionary {
    private static HashSetDictionary instance;
    private HashSet<String> words = new HashSet<>();

    private HashSetDictionary() {
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
            instance = new HashSetDictionary();
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


