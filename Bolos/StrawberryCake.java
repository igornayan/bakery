package Bolos;

public class StrawberryCake extends CakeAbstrato {
    @Override
    public String getDescription() {
        return "Strawberry cake";
    }

    @Override
    public int getCost() {
        return super.getCost() * 2;
    }
}
