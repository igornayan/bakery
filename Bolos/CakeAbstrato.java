package Bolos;

/**
 * Cake bake class.
 */
public abstract class CakeAbstrato {
    private final int CAKE_COST = 10;

    public int getCost() {
        return CAKE_COST;
    }

    public abstract String getDescription();
}
