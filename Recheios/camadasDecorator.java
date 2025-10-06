package Recheios;

import Bolos.CakeAbstrato;

public class camadasDecorator extends RecheiosAbstrato{

    public camadasDecorator(CakeAbstrato decoratedCake) {
        super(decoratedCake);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + super.getDescription();
    }
}
