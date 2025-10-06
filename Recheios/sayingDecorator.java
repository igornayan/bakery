package Recheios;

import Bolos.CakeAbstrato;

public class sayingDecorator extends RecheiosAbstrato{
    private String saying;

    public sayingDecorator(CakeAbstrato decoratedCake, String saying) {
        super(decoratedCake);
        this.saying = saying;
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with saying \"" + saying + "\"";
    }
}
