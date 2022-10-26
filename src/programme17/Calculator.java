package programme17;

public class Calculator {

        Floor floor;
        Carpet carpet;
        Calculator(Floor floor, Carpet carpet){
            super();
            this.floor=floor;
            this.carpet=carpet;
        }
        //method for getting cost
        public double getTotalCost (){
            return carpet.getCost()*floor.getArea();
        }
}
