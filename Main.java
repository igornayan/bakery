import Bolos.CakeAbstrato;
import Bolos.ChocolateCake;
import Bolos.StrawberryCake;
import Bolos.VanillaCake;
import Recheios.camadasDecorator;
import Recheios.granuladoDecorator;
import Recheios.sayingDecorator;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());

        CakeAbstrato vanillaSayingPlain = new sayingDecorator(new VanillaCake(), "PLAIN!");
        order.addCake(vanillaSayingPlain);

        CakeAbstrato fancyVanillaSprinkles = new granuladoDecorator(new sayingDecorator(new VanillaCake(), "FANCY"));
        order.addCake(fancyVanillaSprinkles);

        CakeAbstrato crazyStrawberry = 
        new sayingDecorator(
            new sayingDecorator(
                new granuladoDecorator(
                    new granuladoDecorator(
                        new camadasDecorator(new StrawberryCake())
                    )
                ), "One of"
            ), "EVERYTHING"
        );
        order.addCake(crazyStrawberry);

        // Print the order
        order.printOrder();
    }
}
