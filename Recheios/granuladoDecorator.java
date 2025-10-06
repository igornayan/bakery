package Recheios;

import Bolos.CakeAbstrato;

public class granuladoDecorator extends RecheiosAbstrato {
    public granuladoDecorator(CakeAbstrato decoratedCake) {
        super(decoratedCake);
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with sprinkles";
    }
}
