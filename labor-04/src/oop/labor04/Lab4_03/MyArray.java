package oop.labor04.Lab4_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private double[] array;

    public MyArray(int size) {
        array = new double[size];
    }

    public MyArray(double[] sourceArray) {
        array = Arrays.copyOf(sourceArray, sourceArray.length);
    }

    public MyArray(MyArray sourceArray) {
        array = Arrays.copyOf(sourceArray.array, sourceArray.array.length);
    }

    public MyArray(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file)) {
            int size = scanner.nextInt();
            array = new double[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextDouble();
            }
        }
    }

    // Methods
    public void fillRandom(double a, double b) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = a + (b - a) * rand.nextDouble();
        }
    }

    public double mean() {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public double stddev() {
        double mean = mean();
        double sumSquaredDiff = 0;

        for (double value : array) {
            double diff = value - mean;
            sumSquaredDiff += diff * diff;
        }

        return Math.sqrt(sumSquaredDiff / array.length);
    }

    public void sort() {
        Arrays.sort(array);
    }

    public void print(String arrayName) {
        System.out.print(arrayName + ": ");
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
