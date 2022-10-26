package PoolArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("enter the value of width : ");
        double width = Input.nextDouble();
        System.out.print("enter the value of length : ");
        double length = Input.nextDouble();
        // object of parent class with set the value of constructor Circle
        Rectangle rectangle = new Rectangle(width, length);
        System.out.println("rectangle.width= " + rectangle.getWidth());     //get the value of width
        System.out.println("rectangle.length= " + rectangle.getLength());   //get the value of length
        System.out.println("rectangle.area= " + rectangle.getArea());      //get the area
        System.out.print("enter the value of width : ");
        double width1 = Input.nextDouble();
        System.out.print("enter the value of length : ");
        double length1 = Input.nextDouble();
        System.out.print("enter the value of length : ");
        double height = Input.nextDouble();
        Cuboid cuboid = new Cuboid(width1,length1,height);
        System.out.println("cuboid.width= " + cuboid.getWidth());     //get the value of width
        System.out.println("cuboid.length= " + cuboid.getLength());   //get the value of length
        System.out.println("cuboid.area= " + cuboid.getArea());       //get the area

        System.out.println("cuboid.height= " + cuboid.getHeight());   //get the value of height
        System.out.println("cuboid.volume= " + cuboid.getVolume());  //get the volume
    }

}
