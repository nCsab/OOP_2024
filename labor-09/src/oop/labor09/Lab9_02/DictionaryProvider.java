package oop.labor09.Lab9_02;

public class DictionaryProvider {
    public static IDictionary createDictionary(DictionaryType dtype) {
        IDictionary dictionary = null;
        switch (dtype) {
            case ARRAY_LIST:
                dictionary = ArrayListDictionary.getInstance();
                break;
        }
        return dictionary;
    }
}
