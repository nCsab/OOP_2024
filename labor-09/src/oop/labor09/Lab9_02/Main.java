package oop.labor09.Lab9_02;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
        Scanner scanner = new Scanner(System.in);
        List<String> words = service.searchAllWords(new File("dictionary.txt"));
        while (true) {
            System.out.print("Word to find (Enter <end> to exit): ");
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("end")) {
                break;
            }
            boolean found = service.searchWord(word);
            System.out.println("Find(" + word + "): " + found);
        }
        scanner.close();
    }
}
