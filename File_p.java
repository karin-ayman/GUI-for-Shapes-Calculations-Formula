package oop_project;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_p {

    public static void main(String[] args) {
        File f = null;
        Scanner k = null;
        try {
            f = new File("C:\\Users\\(K_G)\\Documents\\readd.txt");
            k = new Scanner(f);
            String x = k.next();
            int n = Integer.parseInt(x);
            Drawable[] arr = new Drawable[n];

            double CircleAreaSum = 0;
            double CubeAreaSum = 0;
            double CirclePerimeterSum = 0;
            double CubePerimeterSum = 0;
            double CubeVolumSum = 0;

            if (n < 2) {
                System.out.println("Size must be greater than 2");
            } else {
                for (int i = 0; i < arr.length; i++) {
                    String type = k.next();
                    double dim = Double.parseDouble(k.next());
                    switch (type.toLowerCase()) {
                        case "circle":
                            arr[i] = new Circle(dim);
                            CircleAreaSum += ((Circle) arr[i]).getArea();
                            CirclePerimeterSum += ((Circle) arr[i]).getPerimeter();
                            break;
                        case "cube":
                            arr[i] = new Cube(dim);
                            CubeAreaSum += ((Cube) arr[i]).getArea();
                            CubePerimeterSum += ((Cube) arr[i]).getPerimeter();
                            CubeVolumSum += ((Cube) arr[i]).getVolum();
                            break;
                        default:
                            System.out.println("The input shape is not valid");
                            i--; // Decrement to retry this index
                            break;
                    }
                }

                // Move file writing outside of the loop
                FileWriter fw = null;
                PrintWriter pw = null;
                try {
                    fw = new FileWriter("C:\\Users\\(K_G)\\Documents\\writee.txt");
                    pw = new PrintWriter(fw);
                    pw.println("Total area of all shapes = " + (CircleAreaSum + CubeAreaSum));
                    pw.println("Area of circle = " + CircleAreaSum);
                    pw.println("Area of cube = " + CubeAreaSum);
                    pw.println("Perimeter of circle = " + CirclePerimeterSum);
                    pw.println("Perimeter of cube = " + CubePerimeterSum);
                    pw.println("Total Perimeter of all shapes = " + (CirclePerimeterSum + CubePerimeterSum));
                    pw.println("Volume of cube = " + CubeVolumSum);
                } catch (Exception e) {
                    System.out.println("Error writing to file: " + e.getMessage());
                } finally {
                    if (pw != null) {
                        pw.close();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading from file: " + e.getMessage());
        } finally {
            if (k != null) {
                k.close();
            }
        }
    }
}