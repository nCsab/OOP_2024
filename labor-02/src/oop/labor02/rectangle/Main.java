package oop.labor02.rectangle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
            Rectangle[] rectangles = new Rectangle[10];
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                double length = 1 + rand.nextInt(10);
                double width = 1 + rand.nextInt(10) ;
                rectangles[ i ] = new Rectangle(length, width);
                System.out.println("Rectangle " + (i + 1) + " length: " + length);
                System.out.println("Rectangle " + (i + 1) + " width: " + width);
                System.out.println("Rectangle " + (i + 1) + " area: " + rectangles[ i ].area(length, width));
                System.out.println("Rectangle " + (i + 1) + " perimeter: " + rectangles[ i ].perimeter(length, width));
            }
        }
    }
