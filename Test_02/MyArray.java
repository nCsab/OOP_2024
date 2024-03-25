
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private double[] array;
    public MyArray(int capacity) {
        array = new double[capacity];}

    public double mean() {
        if (array.length == 0) {
            System.out.println("Üres.");
            return Double.NaN;
        }

        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}
