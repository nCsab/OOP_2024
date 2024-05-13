package oop.labor12.fel_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(IDictionary dictionary) {
        this.dictionary = DictionaryProvider.createDictionary(DictionaryType.ARRAY_LIST);
    }

    public boolean findWords() {
        return false;
    }

    public ArrayList<String> findWordsFile() {
        return null;
    }
}

