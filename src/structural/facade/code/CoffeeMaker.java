package structural.facade.code;

/**
 * Facade
 */
public class CoffeeMaker {

    private final BeanGrinder beanGrinder = new BeanGrinder();              // Subsystem

    private final EspressoMachine espressoMachine = new EspressoMachine();  // Subsystem

    private final WaterBoiler waterBoiler = new WaterBoiler();              // Subsystem

    public void makeCoffee() {
        beanGrinder.grindBeans();
        espressoMachine.makeEspresso();
        waterBoiler.boilWater();
        System.out.println("Hot Americano is here.");
    }
}
