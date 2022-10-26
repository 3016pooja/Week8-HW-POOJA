package programme17;

public class Carpet {
    double cost;

    //constructor with param
    Carpet(double cost) {
        if (cost < 0)
            cost = 0;
        this.cost = cost;
    }

    //1 method with para
    public double getCost() {
        return cost;
    }

}