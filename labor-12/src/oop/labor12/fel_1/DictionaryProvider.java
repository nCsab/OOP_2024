package oop.labor12.fel_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryProvider {
    private static IDictionary dictionary;

    public DictionaryProvider(DictionaryType dictionaryType) {
        createDictionary(dictionaryType);
    }

    public static IDictionary createDictionary(DictionaryType dtype) {
        switch (dtype) {
            case ARRAY_LIST:
                dictionary =
                        ArrayListDictionary.newInstance();
                break;
            case HASH_SET:
                dictionary =
                        HashSetDictionary.newInstance();
                break;
            case TREE_SET:
                dictionary =
                        TreeSetDictionary.newInstance();
                break;
        }
        return dictionary;
    }

    public void findWordsFile(String s) {
        try (Scanner scanner = new Scanner(new File(s))) {
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] tokens = line.split(" ,.!?");
                for (int i = 0; i < tokens.length; i++) {
                    String word = tokens[i].trim();
                    dictionary.find(word);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


