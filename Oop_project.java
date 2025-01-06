package oop_project;

import java.util.Scanner;
import java.util.Date;



public class Oop_project {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        Drawable[] arr = new Drawable[n];
        double CircleAreaSum = 0;
        double CubeAreaSum = 0;
        double CirclePerimeterSum = 0;
        double CubePerimeterSum = 0;
        double CubeVolumeSum = 0;

        if (n < 2) {
            System.out.println("Size must be greater than 2");
        } else {
        	for(int i =0;i<arr.length;i++)
        	{
        		String type =args[i*2+1];
        		double dim=Double.parseDouble(args[i*2+2]);
        		switch (type.toLowerCase()) {
                case ("circle"):
                    arr[i] = new Circle(dim);
                    CircleAreaSum += ((Circle) arr[i]).getArea();
                    CirclePerimeterSum += ((Circle) arr[i]).getPerimeter();
                    break;
                case ("cube"):
                    arr[i] = new Cube(dim);
                    CubeAreaSum += ((Cube) arr[i]).getArea();
                    CubePerimeterSum += ((Cube) arr[i]).getPerimeter();
                    CubeVolumeSum += ((Cube) arr[i]).getVolum();
                    break;
                default:
                    System.out.println("there is shape is not valid (cube and circle only)");
                    break;
            }
        		
        		
        	}
        	 System.out.println("Total area of all shaps = "+ (CircleAreaSum+CubeAreaSum));
        	 System.out.println("Total Perimeter of all shaps = "+ (CirclePerimeterSum+CubePerimeterSum));
        	 System.out.println("Area of circle = "+CircleAreaSum);
			 System.out.println("Area of cube = "+CubeAreaSum);
			 System.out.println("Perimeter of circle = "+CirclePerimeterSum);
			 System.out.println("Perimeter of cube = "+CubePerimeterSum);
			 System.out.println("Volum of cube = "+CubeVolumeSum);
        	
        }

	}



	
}
