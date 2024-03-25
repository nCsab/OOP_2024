package oop.labor06.Lab6_02;
import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double[][] array) {
        this.rows = array.length;
        this.columns = array[0].length;
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            this.data[i] = Arrays.copyOf(array[i], columns); // Deep copy
        }
    }

    public Matrix(Matrix otherMatrix) {
        this.rows = otherMatrix.getRows();
        this.columns = otherMatrix.getColumns();
        this.data = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            this.data[i] = Arrays.copyOf(otherMatrix.data[i], columns); // Deep copy
        }
    }

    public void fillRandom(double minVal, double maxVal) {
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = minVal + (maxVal - minVal) * random.nextDouble();
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix matrix2) {
        if (this.rows != matrix2.getRows() || this.columns != matrix2.getColumns()) {
            throw new IllegalArgumentException("Matrix dimensions don't match for addition");
        }
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] + matrix2.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix matrix2) {
        if (this.columns != matrix2.getRows()) {
            throw new IllegalArgumentException("Number of columns in the first matrix must match the number of rows in the second matrix");
        }
        Matrix result = new Matrix(this.rows, matrix2.getColumns());
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix2.getColumns(); j++) {
                for (int k = 0; k < this.columns; k++) {
                    result.data[i][j] += this.data[i][k] * matrix2.data[k][j];
                }
            }
        }
        return result;
    }

    public Matrix transpose() {
        Matrix result = new Matrix(this.columns, this.rows);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.data[j][i] = this.data[i][j];
            }
        }
        return result;
    }
}
