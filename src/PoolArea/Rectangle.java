package PoolArea;

public class Rectangle {
    double width;
    double length;
    //this constructor used to set the value
    public Rectangle(double width,double length){
        if(width <0){
            this.width = 0;
        } else {
            this.width = width;
        }

        if(length <0){
            this.length = 0;
        } else {
            this.length = length;
        }
    }
    //this method used to get the value of width
    public double getWidth() {
        return width;
    }
    //this method used to get the value of length
    public double getLength() {
        return length;
    }
    //this method used to calculae the area
    public double getArea(){
        return width * length;
    }

}
