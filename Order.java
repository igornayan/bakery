import Bolos.CakeAbstrato;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a collection of cakes being ordered by a customer
 */
public class Order {
    private final List<CakeAbstrato> cakeAbstratoes = new ArrayList<>();

    public void addCake(CakeAbstrato cakeAbstrato) {
        cakeAbstratoes.add(cakeAbstrato);
    }

    public void printOrder() {
        for (CakeAbstrato cakeAbstrato : cakeAbstratoes) {
            System.out.printf("   %2d  %s\n", cakeAbstrato.getCost(), cakeAbstrato.getDescription());
        }
    }
}
