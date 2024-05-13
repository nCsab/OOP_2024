package oop.labor12.fel_1;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        DictionaryProvider service = new
                DictionaryProvider(DictionaryType.ARRAY_LIST);
        service.findWordsFile("dictionary.txt");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed / 1000000);
        long startTime2 = System.nanoTime();
        DictionaryProvider service2 = new
                DictionaryProvider(DictionaryType.HASH_SET);
        service.findWordsFile("dictionary.txt");
        long endTime2 = System.nanoTime();
        long timeElapsed2 = endTime2 - startTime2;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed2 / 1000000);

        long startTime3 = System.nanoTime();
        DictionaryProvider service3 = new
                DictionaryProvider(DictionaryType.TREE_SET);
        service.findWordsFile("bible.txt");
        long endTime3 = System.nanoTime();
        long timeElapsed3 = endTime3 - startTime3;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed3 / 1000000);
    }
}

