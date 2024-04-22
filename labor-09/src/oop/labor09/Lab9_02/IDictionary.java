package oop.labor09.Lab9_02;

import java.io.File;
import java.util.List;

public interface IDictionary {
    boolean search(String word);
    List<String> searchAllWords(File textFile);
}
