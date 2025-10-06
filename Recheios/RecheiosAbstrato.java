package Recheios;

import Bolos.CakeAbstrato;

public abstract class RecheiosAbstrato extends CakeAbstrato {
    protected CakeAbstrato decoratedCake;

    public RecheiosAbstrato(CakeAbstrato decoratedCake) {
        this.decoratedCake = decoratedCake;
    }

    @Override
    public int getCost() {
        return decoratedCake.getCost();
    }

    @Override
    public String getDescription() {
        return decoratedCake.getDescription();
    }
}
