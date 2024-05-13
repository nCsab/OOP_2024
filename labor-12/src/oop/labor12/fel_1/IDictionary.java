package oop.labor12.fel_1;

import java.io.File;
import java.util.List;

public interface IDictionary {
    String DICTIONARY_FILE = "bible.txt";

    boolean add(String word);

    boolean find(String word);

    int size();
}

