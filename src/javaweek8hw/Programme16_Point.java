package javaweek8hw;

public class Programme16_Point {
       int x;
        int y;
        //this constructor with 0 arguments
        public Programme16_Point() {
        }
        //this constructor used to initilazed the value
        public Programme16_Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //this method is used to set the value of x
        public void setX(int x) {
            this.x = x;
        }

        //this method is used to set the value of y
        public void setY(int y) {
            this.y = y;
        }

        //this method is used to get the value of x
        public int getX() {
            return x;
        }

        //this method is used to get the value of y
        public int getY() {
            return y;
        }

        //this method is 0 paratmenter to find the distance of points
        public double distance() {
            double dis;
            int x1 = getX();
            int x2 = 0;
            int y1 = getY();
            int y2 = 0;
            dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
            return dis;
        }

        //this method is 2 paratmenter to find the distance of points
        public double distance(int x, int y) {
            double dis;
            int x1 = this.x;
            int x2 = x;
            int y1 = this.y;
            int y2 = y;
            dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
            return dis;
        }

        //this method is pass the object paratmenter to find the distance of points
        public double distance(Programme16_Point second) {
            double dis;
            double x1 = this.x;
            double x2 = second.x;
            double y1 = this.y;
            double y2 = second.y;
            dis = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
            return dis;
        }

        public static void main(String[] args) {
            //set the va;ue of x and y
            Programme16_Point first = new Programme16_Point(6, 5);
            Programme16_Point second = new Programme16_Point(3, 1);
            System.out.println("distance(0,0)= " + first.distance());     //get the distance of points
            //get the distance of points with passing parameter as object
            System.out.println("distance(second)= " + first.distance(second));
            System.out.println("distance(2,2)= " + first.distance(2, 2));
            Programme16_Point point = new Programme16_Point();
            System.out.println("distance()= " + point.distance());
        }

    }
